package com.mycompany.oodms.customer;

import com.mycompany.oodms.FileService;
import com.mycompany.oodms.item.Item;
import com.mycompany.oodms.order.CustomerOrder;
import com.mycompany.oodms.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Customer extends User {
    public static final String FILENAME = "customer";

    private String phoneNo;
    private List<CartItem> cart;

    public Customer(Long id, String username, String password, Boolean staff, Boolean admin, String phoneNo) {
        super(id, username, password, staff, admin);
        this.phoneNo = phoneNo;
        this.cart = CartItem.getCartItem(id);
    }

    public Customer(List<String> customerData) {
        this(
                Long.valueOf(customerData.get(0)),
                customerData.get(1),
                customerData.get(2),
                Boolean.valueOf(customerData.get(3)),
                Boolean.valueOf(customerData.get(4)),
                customerData.get(5)
        );
    }

    public Customer() {
        this(null, null,null, null, null, null);
    }

    @Override
    public List<String> toList() {
        List<String> list = super.toList();
        list.add(phoneNo);
        return list;
    }

    @Override
    public boolean fileAddNewRow() {
        if (super.fileAddNewRow()) {
            List<String> customerData = List.of(
                    String.valueOf(getId()),
                    phoneNo
            );
            return FileService.insertData(FILENAME, customerData);
        }
        return false;
    }

    @Override
    public boolean fileUpdate() {
        if (super.fileUpdate()) {
            List<String> customerData = List.of(
                    String.valueOf(getId()),
                    phoneNo
            );
            return FileService.updateSingleRow(FILENAME, customerData, FileService.ID_COLUMN);
        }
        return false;
    }

    // adding new cart item
    public boolean addCartItem(Item item, int quantity) {
        Optional<CartItem> existCartItem = this.cart.stream().filter(cartItem -> cartItem.getItem().getId().equals(item.getId())).findFirst();
        if (existCartItem.isPresent()) {
            System.out.println("Item is already exist in cart, cannot add in it");
            return false;
        }
        CartItem cartItem = new CartItem(item, quantity);
        this.cart.add(cartItem);
        // add new cart item data into cart file
        return cartItem.fileAddNewRow(this.getId());
    }

    // only use when cart item quantity is change
    public boolean updateCartItem(List<CartItem> cart) {
        List<Long> cartItemId = cart.stream().map(cartItem -> cartItem.getItem().getId()).toList();
        int match = 0;
        for (CartItem cartItem : this.cart) {
            for (Long id : cartItemId) {
                if (cartItem.getItem().getId().equals(id)) {
                    match++;
                    break;
                }
            }
        }
        // check the current cart is same size as new cart
        if (this.cart.size() != match) {
            System.out.println("New cart item does not match with current cart item");
            return false;
        }
        this.cart = cart;
        List<List<String>> newStringCart = new ArrayList<>(cart.stream()
                .map(cartItem -> {
                    List<String> cartItemList = cartItem.toList();
                    cartItemList.add(0, String.valueOf(this.getId()));
                    return cartItemList;
                }).toList());
        // update the file with new cart
        return FileService.updateMultipleRows(CartItem.FILENAME, newStringCart, 0, 1);
    }

    // delete cart item
    public boolean deleteCartItem(Item item) {
        Optional<CartItem> existCartItem = this.cart.stream().filter(cartItem -> cartItem.getItem().getId().equals(item.getId())).findFirst();
        if (existCartItem.isEmpty()) {
            System.out.println("Item is not exist in cart");
            return false;
        }
        CartItem cartItem = existCartItem.get();
        this.cart.remove(cartItem);
        // delete the cart data
        return cartItem.fileDeleteRow(this.getId());
    }

    // create and save new customer order
    public boolean checkOut(String typeOfPayment) {
        // get new id
        Long id = FileService.getNewId(CustomerOrder.FILENAME);
        if (id == null || id == -1) {
            return false;
        }
        CustomerOrder customerOrder = new CustomerOrder(id, typeOfPayment, this);
        // save the order including the order payment, delivery order and order detail
        if (customerOrder.fileAddNewRow()) {
            this.cart.clear();
            return true;
        }
        return false;
    }

    // register a new account
    public static String register(String name, String password, String phoneNo) {
        // validate the name, password and phone number
        String errorMessage = validate(name, password, phoneNo);

        // if error message is not empty then return error message
        if (!errorMessage.isEmpty()) {
            return errorMessage;
        }

        // get any current taken username
        List<String> checkUsername = FileService.getOneSpecificData(USER_FILENAME, 1, name);

        // check username taken
        if (!checkUsername.isEmpty()) {
            return "Username has been taken";
        }

        // get new id
        Long id = FileService.getNewId(USER_FILENAME);
        if (id == null || id == -1) {
            return "The system had met an error, please contact the technical support";
        }

        Customer customer = new Customer(id, name, password, false, false, phoneNo);
        // save new customer data
        customer.fileAddNewRow();

        return "";
    }

    // validate the input
    public static String validate(String name, String password, String phoneNo) {
        String errorMessage = User.validate(name, password);

        if (phoneNo.length() < 11) {
            errorMessage += "Phone number is not valid";
        }

        return errorMessage;
    }

    // get the customer data by customer id
    public static Customer getCustomerById(long id) {
        String idString = String.valueOf(id);
        List<String> userData = FileService.getOneSpecificData(User.USER_FILENAME, FileService.ID_COLUMN, idString);
        List<String> customerData = FileService.getOneSpecificData(Customer.FILENAME, FileService.ID_COLUMN, idString);
        customerData = User.joinWithUser(customerData, userData);
        if (customerData == null) {
            return null;
        }
        return new Customer(customerData);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<CartItem> getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "\nCustomer{\n\t" +
                super.toString() + ",\n" +
                "\tphoneNo='" + phoneNo + "',\n" +
                "\tcart=" + cart +
                "\n}";
    }
}
