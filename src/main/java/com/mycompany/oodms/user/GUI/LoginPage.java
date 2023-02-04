/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.user.GUI;

import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.admin.Admin;
import com.mycompany.oodms.admin.GUI.AdminPanelForm;
import com.mycompany.oodms.customer.Customer;
import com.mycompany.oodms.deliveryStaff.DeliveryStaff;
import com.mycompany.oodms.user.User;

/**
 *
 * @author Wong Chi Jian
 */
public class LoginPage extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public LoginPage() {
        initComponents();
        loginMsgLb.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLb = new javax.swing.JLabel();
        formPn = new javax.swing.JPanel();
        usernameLb = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        pssLb = new javax.swing.JLabel();
        pssField = new javax.swing.JPasswordField();
        loginMsgLb = new javax.swing.JLabel();
        backBtt = new javax.swing.JButton();
        loginBtt = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 300));
        setPreferredSize(new java.awt.Dimension(600, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLb.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLb.setText("Login");
        add(titleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 240, -1));

        formPn.setBackground(new java.awt.Color(255, 255, 255));
        formPn.setMinimumSize(new java.awt.Dimension(540, 120));
        formPn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLb.setText("Username:");
        formPn.add(usernameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 30));

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameField.setToolTipText("");
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        formPn.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 340, 30));

        pssLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pssLb.setText("Password:");
        formPn.add(pssLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        pssField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        formPn.add(pssField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 340, 30));

        loginMsgLb.setForeground(java.awt.Color.red);
        loginMsgLb.setText("Incorrect username and password");
        formPn.add(loginMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 340, 20));

        add(formPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 520, 160));

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
        add(backBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        loginBtt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtt.setText("Login");
        loginBtt.setFocusable(false);
        loginBtt.setPreferredSize(new java.awt.Dimension(200, 50));
        loginBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttActionPerformed(evt);
            }
        });
        add(loginBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttActionPerformed
        OODMS.frame.refresh(new HomePage());
    }//GEN-LAST:event_backBttActionPerformed

    private void loginBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttActionPerformed
        loginMsgLb.setVisible(false);

        String username = usernameField.getText();
        String pss = new String(pssField.getPassword());
        User user = User.verify(username, pss);
        if (user != null) {
            OODMS.currentUser = user;
            if (user instanceof Customer) {
                System.out.println("customer");
            } else if (user instanceof Admin) {
                OODMS.frame.refresh(new AdminPanelForm());
            } else if (user instanceof DeliveryStaff) {
                System.out.println("delivery staff");
            }
            return;
        }
        loginMsgLb.setVisible(true);
    }//GEN-LAST:event_loginBttActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtt;
    private javax.swing.JPanel formPn;
    private javax.swing.JButton loginBtt;
    private javax.swing.JLabel loginMsgLb;
    private javax.swing.JPasswordField pssField;
    private javax.swing.JLabel pssLb;
    private javax.swing.JLabel titleLb;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLb;
    // End of variables declaration//GEN-END:variables
}
