package com.mycompany.oodms.customer;

import com.mycompany.oodms.FileService;
import com.mycompany.oodms.ForeignKey;
import com.mycompany.oodms.item.Item;

import java.util.ArrayList;
import java.util.List;

public class CartItem implements ForeignKey {
    // columns order in file: Customer ID, Item ID, quantity

    public static final String FILENAME = "cart";
    private Item item;
    private Integer quantity;

    public CartItem(Item item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public List<String> toList() {
        return new ArrayList<>(List.of(
                String.valueOf(item.getId()),
                String.valueOf(quantity)
        ));
    }

    @Override
    public boolean fileAddNewRow(long foreignKeyId) {
        List<String> cartItemData = toList();
        cartItemData.add(0, String.valueOf(foreignKeyId));
        return FileService.insertData(FILENAME, cartItemData);
    }

    @Override
    public boolean fileUpdate(long foreignKeyId) {
        List<String> cartItemData = toList();
        cartItemData.add(0, String.valueOf(foreignKeyId));
        return FileService.updateSingleRow(FILENAME, cartItemData, 0, 1);
    }

    public static List<CartItem> getCartItem(Long customerId) {
        // get all cart item
        List<List<String>> cartItem = FileService.getMultipleSpecificData(FILENAME, 0, String.valueOf(customerId));
        // create new array to store cart item
        List<CartItem> cart = new ArrayList<>();
        for (List<String> itemRow : cartItem) {
            // get from item file
            List<String> item = FileService.getOneSpecificData(Item.FILENAME, 0, itemRow.get(1));
            // create new CartItem object then added into array
            cart.add(new CartItem(new Item(item), Integer.valueOf(itemRow.get(2))));
        }
        return cart;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\n\t\tCartItem{" +
                " item = " + item +
                ", quantity=" + quantity +
                "}";
    }
}