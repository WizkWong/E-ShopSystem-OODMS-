/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.customer.GUI;

import com.mycompany.oodms.Component.EditNumberForm;
import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.customer.CartItem;
import com.mycompany.oodms.customer.Customer;
import com.mycompany.oodms.item.Item;
import com.mycompany.oodms.item.ItemDao;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.List;

/**
 *
 * @author Wong Chi Jian
 */
public class CustomerCartPage extends javax.swing.JPanel {

    private final DefaultTableModel productTableModel;
    private final ItemDao itemDao;
    private final String desphtml = "<html><p style=\"width:285px\">%s</p></html>";

    /**
     * Creates new form CustomerCartPage
     */
    public CustomerCartPage() {
        initComponents();
        itemDao = OODMS.getItemDao();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);

        TableColumnModel productTableColumnModel = productTable.getColumnModel();
        productTableColumnModel.getColumn(1).setCellRenderer(leftRenderer);
        productTableColumnModel.getColumn(2).setCellRenderer(centerRenderer);
        productTableColumnModel.getColumn(3).setCellRenderer(centerRenderer);

        productTableModel = (DefaultTableModel) productTable.getModel();
        productTable.removeColumn(productTableColumnModel.getColumn(0));

        Customer customer = (Customer) OODMS.currentUser;
        List<CartItem> cartItemList = customer.getCart();
        cartItemList.forEach(cartItem -> {
            Item item = cartItem.getItem();
            productTableModel.addRow(new Object[] {item.getId(), item.getName(), item.getPrice(), cartItem.getQuantity()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        despLb = new javax.swing.JLabel();
        despTitleLb = new javax.swing.JLabel();
        backBtt = new javax.swing.JButton();
        checkOutBtt = new javax.swing.JButton();
        editBtt = new javax.swing.JButton();
        deleteBtt = new javax.swing.JButton();
        titleLb = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setRowHeight(25);
        productTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productTableMousePressed(evt);
            }
        });
        JScrollPane2.setViewportView(productTable);

        add(JScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 560, 370));

        despLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        despLb.setText("Please select any product from product table");
        despLb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        despLb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        despLb.setMaximumSize(new java.awt.Dimension(380, 600));
        despLb.setMinimumSize(new java.awt.Dimension(380, 600));
        despLb.setOpaque(true);
        despLb.setPreferredSize(new java.awt.Dimension(380, 600));
        add(despLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        despTitleLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        despTitleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        despTitleLb.setText("Description");
        despTitleLb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        despTitleLb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(despTitleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 380, -1));

        backBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBtt.setText("Back");
        backBtt.setFocusable(false);
        backBtt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtt.setInheritsPopupMenu(true);
        backBtt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backBtt.setPreferredSize(new java.awt.Dimension(200, 50));
        backBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBttActionPerformed(evt);
            }
        });
        add(backBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        checkOutBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkOutBtt.setText("Check Out");
        checkOutBtt.setFocusable(false);
        checkOutBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBttActionPerformed(evt);
            }
        });
        add(checkOutBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 140, 40));

        editBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editBtt.setText("Edit Amount");
        editBtt.setEnabled(false);
        editBtt.setFocusable(false);
        editBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttActionPerformed(evt);
            }
        });
        add(editBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 140, 40));

        deleteBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtt.setText("Delete");
        deleteBtt.setEnabled(false);
        deleteBtt.setFocusable(false);
        deleteBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttActionPerformed(evt);
            }
        });
        add(deleteBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 140, 40));

        titleLb.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLb.setText("Cart");
        add(titleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMousePressed
        int select = productTable.getSelectedRow();
        long id = (long) productTableModel.getValueAt(select, 0);
        Item item = itemDao.searchId(id);
        if (item == null) {
            despLb.setText("Error, selected product cannot be found");
            return;
        }
        despLb.setText(String.format(desphtml, item.getDescription()));
        deleteBtt.setEnabled(true);
        editBtt.setEnabled(true);
    }//GEN-LAST:event_productTableMousePressed

    private void backBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttActionPerformed
        OODMS.frame.refresh(new CustomerHomePage());
    }//GEN-LAST:event_backBttActionPerformed

    private void checkOutBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBttActionPerformed
        OODMS.frame.refresh(new CustomerCheckOutPage());
    }//GEN-LAST:event_checkOutBttActionPerformed

    private void deleteBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttActionPerformed
        int select = productTable.getSelectedRow();
        long id = (long) productTableModel.getValueAt(select, 0);
        Item item = itemDao.searchId(id);
        if (item == null) {
            JOptionPane.showMessageDialog(null, "Item does not exist, please refresh!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this cart item", "Warning", JOptionPane.OK_CANCEL_OPTION);
        if (option != JOptionPane.OK_OPTION) {
            return;
        }
        Customer customer = (Customer) OODMS.currentUser;
        if (customer.deleteCartItem(item)) {
            JOptionPane.showMessageDialog(null, "Successfully remove the cart item", "Success", JOptionPane.PLAIN_MESSAGE);
            productTableModel.removeRow(select);
            despLb.setText("Please select any product from product table");
        } else {
            OODMS.showErrorMessage();
        }
    }//GEN-LAST:event_deleteBttActionPerformed

    private void editBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttActionPerformed
        int select = productTable.getSelectedRow();
        long id = (long) productTableModel.getValueAt(select, 0);
        Item item = itemDao.searchId(id);
        if (item == null) {
            JOptionPane.showMessageDialog(null, "Item does not exist, please refresh!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int quantity = (int) productTableModel.getValueAt(select, 3);
        EditNumberForm form = new EditNumberForm("Edit quantity of item", String.format("Current stock left: %d quantity<br>\"%s\" quantity:", item.getStock(),item.getName()), quantity);
        int option = JOptionPane.showConfirmDialog(null, form, "Edit \"" + item.getName() + "\" quantity", JOptionPane.OK_CANCEL_OPTION);
        if (option != JOptionPane.OK_OPTION) {
            return;
        }

        int newQuantity = form.getNumber();
        if (newQuantity > item.getStock() + quantity) {
            JOptionPane.showMessageDialog(null, String.format("Quantity chosen is exceed this item quantity, only %d left", item.getStock()), "Quantity Exceeded", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Customer customer = (Customer) OODMS.currentUser;
        if (customer.updateCartItem(item, newQuantity)) {
            JOptionPane.showMessageDialog(null, "Successfully update the cart item", "Success", JOptionPane.PLAIN_MESSAGE);
            productTableModel.setValueAt(form.getNumber(), select, 3);
        } else {
            OODMS.showErrorMessage();
        }

    }//GEN-LAST:event_editBttActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JButton backBtt;
    private javax.swing.JButton checkOutBtt;
    private javax.swing.JButton deleteBtt;
    private javax.swing.JLabel despLb;
    private javax.swing.JLabel despTitleLb;
    private javax.swing.JButton editBtt;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel titleLb;
    // End of variables declaration//GEN-END:variables
}
