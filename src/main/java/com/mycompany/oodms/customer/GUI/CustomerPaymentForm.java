/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.customer.GUI;

import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.customer.Customer;
import com.mycompany.oodms.order.CustomerOrder;
import com.mycompany.oodms.order.CustomerOrderPayment;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Wong Chi Jian
 */
public class CustomerPaymentForm extends javax.swing.JPanel {

    private final Customer customer;
    private final String address;
    private final String typeOfPayment;
    /**
     * Creates new form PaymentForm
     */
    public CustomerPaymentForm(String address, String typeOfPayment) {
        customer = (Customer) OODMS.currentUser;
        this.address = address;
        this.typeOfPayment = typeOfPayment;
        initComponents();
        expiryInvalidMsgLb.setVisible(false);
        cvcMsgLb.setVisible(false);
        errorMsgLb.setVisible(false);
        expiryExpireMsgLb.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmBtt = new javax.swing.JButton();
        titleLb = new javax.swing.JLabel();
        cardLb = new javax.swing.JLabel();
        cardField = new com.mycompany.oodms.Component.JNumberField();
        slashLb = new javax.swing.JLabel();
        expiryLb = new javax.swing.JLabel();
        exLb = new javax.swing.JLabel();
        monthField = new com.mycompany.oodms.Component.JNumberField();
        yearField = new com.mycompany.oodms.Component.JNumberField();
        expiryInvalidMsgLb = new javax.swing.JLabel();
        expiryExpireMsgLb = new javax.swing.JLabel();
        cvcLb = new javax.swing.JLabel();
        cvcField = new com.mycompany.oodms.Component.JNumberField();
        cvcMsgLb = new javax.swing.JLabel();
        backBtt = new javax.swing.JButton();
        errorMsgLb = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(540, 365));
        setPreferredSize(new java.awt.Dimension(540, 365));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmBtt.setText("Confirm Payment");
        confirmBtt.setFocusable(false);
        confirmBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBttActionPerformed(evt);
            }
        });
        add(confirmBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 40));

        titleLb.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLb.setText("Payment Form");
        add(titleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        cardLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cardLb.setText("Card Number:");
        add(cardLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        cardField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        cardField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cardField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 340, 30));

        slashLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        slashLb.setText("/");
        add(slashLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 20, 30));

        expiryLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        expiryLb.setText("Expiry Date:");
        add(expiryLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 30));

        exLb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        exLb.setText("Ex: Month / Year");
        add(exLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 120, 30));

        monthField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        monthField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(monthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 30));

        yearField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        yearField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, 30));

        expiryInvalidMsgLb.setForeground(java.awt.Color.red);
        expiryInvalidMsgLb.setText("Expiry Date Invalid");
        add(expiryInvalidMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, 20));

        expiryExpireMsgLb.setForeground(java.awt.Color.red);
        expiryExpireMsgLb.setText("This card is Expired!");
        add(expiryExpireMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, 20));

        cvcLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cvcLb.setText("CVC Number:");
        add(cvcLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        cvcField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        cvcField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cvcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        cvcMsgLb.setForeground(java.awt.Color.red);
        cvcMsgLb.setText("CVC Invalid");
        add(cvcMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 20));

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

        errorMsgLb.setForeground(java.awt.Color.red);
        errorMsgLb.setText("There is empty field, please fill out the all the field!");
        add(errorMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 280, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void backBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttActionPerformed
        OODMS.frame.refresh(new CustomerCheckOutPage(address, typeOfPayment));
    }//GEN-LAST:event_backBttActionPerformed

    private void confirmBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBttActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to confirm your order", "Warning", JOptionPane.OK_CANCEL_OPTION);
        if (option != JOptionPane.OK_OPTION) {
            return;
        }
        String card = cardField.getText();
        String month = monthField.getText();
        String year = yearField.getText();
        String cvc = cvcField.getText();

        expiryInvalidMsgLb.setVisible(false);
        cvcMsgLb.setVisible(false);
        errorMsgLb.setVisible(false);
        expiryExpireMsgLb.setVisible(false);
        cardField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        monthField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        yearField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        cvcField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));

        String errorMsg = CustomerOrderPayment.validate(card, month, year, cvc);
        if (errorMsg.isEmpty()) {
            CustomerOrder customerOrder = new CustomerOrder(null, typeOfPayment, card, customer, address);
            if (customer.checkOut(customerOrder)) {
                customer.clearCartItem();
                JOptionPane.showMessageDialog(null, "Your order has been created, please check your order history to tract your order", "Success", JOptionPane.INFORMATION_MESSAGE);
                OODMS.frame.refresh(new CustomerHomePage());
            } else {
                OODMS.showErrorMessage();
            }
            return;
        }

        // show error message in GUI
        if (errorMsg.contains("Card is empty;")) {
            cardField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            errorMsgLb.setVisible(true);
        }
        if (errorMsg.contains("Month is empty;")) {
            monthField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            errorMsgLb.setVisible(true);
        }
        if (errorMsg.contains("Year is empty;")) {
            yearField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            errorMsgLb.setVisible(true);
        }
        if (errorMsg.contains("cvc is empty;")) {
            cvcField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            errorMsgLb.setVisible(true);
        }
        if (errorMsg.contains("expiry date invalid;")) {
            expiryInvalidMsgLb.setVisible(true);
            monthField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            yearField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }
        if (errorMsg.contains("this card is expired;")) {
            expiryExpireMsgLb.setVisible(true);
            monthField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            yearField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }
        if (errorMsg.contains("cvc is invalid;")) {
            cvcMsgLb.setVisible(true);
            cvcField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }
    }//GEN-LAST:event_confirmBttActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtt;
    private com.mycompany.oodms.Component.JNumberField cardField;
    private javax.swing.JLabel cardLb;
    private javax.swing.JButton confirmBtt;
    private com.mycompany.oodms.Component.JNumberField cvcField;
    private javax.swing.JLabel cvcLb;
    private javax.swing.JLabel cvcMsgLb;
    private javax.swing.JLabel errorMsgLb;
    private javax.swing.JLabel exLb;
    private javax.swing.JLabel expiryExpireMsgLb;
    private javax.swing.JLabel expiryInvalidMsgLb;
    private javax.swing.JLabel expiryLb;
    private com.mycompany.oodms.Component.JNumberField monthField;
    private javax.swing.JLabel slashLb;
    private javax.swing.JLabel titleLb;
    private com.mycompany.oodms.Component.JNumberField yearField;
    // End of variables declaration//GEN-END:variables
}
