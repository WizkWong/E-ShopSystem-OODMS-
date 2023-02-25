/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.customer.GUI;

import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.customer.Customer;
import com.mycompany.oodms.customer.CustomerDao;
import com.mycompany.oodms.order.CustomerOrder;
import com.mycompany.oodms.order.CustomerOrderDao;
import com.mycompany.oodms.user.User;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.Optional;

/**
 *
 * @author Wong Chi Jian
 */
public class CustomerProfilePage extends javax.swing.JPanel {

    private final List<CustomerOrder> customerOrderList;
    private final CustomerDao customerDao;
    private final CustomerOrderDao customerOrderDao;
    private final DefaultTableModel orderHistoryTableModel;
    private CustomerOrder orderSelected = null;
    /**
     * Creates new form CustomerProfilePage
     */
    public CustomerProfilePage() {
        customerDao = OODMS.getCustomerDao();
        customerOrderDao = OODMS.getCustomerOrderDao();
        initComponents();
        usernameMsgLb.setVisible(false);
        emailMsgLb.setVisible(false);
        phoneNoMsgLb.setVisible(false);
        usernameField.setVisible(false);
        emailField.setVisible(false);
        phoneNoField.setVisible(false);
        usernameUserLb.setText(OODMS.currentUser.getUsername());
        emailUserLb.setText(OODMS.currentUser.getEmail());
        phoneNoUserLb.setText(OODMS.currentUser.getPhoneNo());

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        TableColumnModel productTableColumnModel = orderHistoryTable.getColumnModel();
        productTableColumnModel.getColumn(0).setCellRenderer(centerRenderer);
        productTableColumnModel.getColumn(1).setCellRenderer(centerRenderer);
        productTableColumnModel.getColumn(2).setCellRenderer(centerRenderer);
        productTableColumnModel.getColumn(3).setCellRenderer(centerRenderer);
        productTableColumnModel.getColumn(4).setCellRenderer(centerRenderer);

        orderHistoryTableModel = (DefaultTableModel) orderHistoryTable.getModel();
        customerOrderList = customerOrderDao.getById((Customer) OODMS.currentUser);
        customerOrderList.forEach(order -> orderHistoryTableModel.addRow(new Object[] {
                order.getId(),
                order.getOrderDetail().size(),
                order.getCustomerOrderPayment().getTotalPrice(),
                order.getStringOrderDateTime(),
                order.getDeliveryOrder().getDeliveryStatus().getUserStatus()
        }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPn = new javax.swing.JPanel();
        usernameUserLb = new javax.swing.JLabel();
        emailUserLb = new javax.swing.JLabel();
        phoneNoUserLb = new javax.swing.JLabel();
        usernameLb = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailLb = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        phoneNoLb = new javax.swing.JLabel();
        phoneNoField = new com.mycompany.oodms.Component.JNumberField();
        usernameMsgLb = new javax.swing.JLabel();
        emailMsgLb = new javax.swing.JLabel();
        phoneNoMsgLb = new javax.swing.JLabel();
        backBtt = new javax.swing.JButton();
        changePssBtt = new javax.swing.JButton();
        editBtt = new javax.swing.JButton();
        titleLb = new javax.swing.JLabel();
        phLb = new javax.swing.JLabel();
        viewPHBtt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderHistoryTable = new javax.swing.JTable();
        usernameMsgLb1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(570, 600));
        setPreferredSize(new java.awt.Dimension(570, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPn.setBackground(new java.awt.Color(255, 255, 255));
        formPn.setPreferredSize(new java.awt.Dimension(540, 320));
        formPn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameUserLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameUserLb.setText("Your Username");
        formPn.add(usernameUserLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 340, 30));

        emailUserLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailUserLb.setText("Your Email");
        formPn.add(emailUserLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 340, 30));

        phoneNoUserLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNoUserLb.setText("Your Phone Number");
        formPn.add(phoneNoUserLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 340, 30));

        usernameLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLb.setText("Username:");
        formPn.add(usernameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameField.setToolTipText("");
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        usernameField.setMargin(new java.awt.Insets(2, 10, 2, 10));
        formPn.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 340, 30));

        emailLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLb.setText("Email:");
        formPn.add(emailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 30));

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailField.setToolTipText("");
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        emailField.setMargin(new java.awt.Insets(2, 10, 2, 10));
        formPn.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 340, 30));

        phoneNoLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNoLb.setText("Phone Number:");
        formPn.add(phoneNoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        phoneNoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        phoneNoField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNoField.setMargin(new java.awt.Insets(2, 10, 2, 10));
        formPn.add(phoneNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 340, 30));

        usernameMsgLb.setText("Username must be at least 4 characters");
        formPn.add(usernameMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 340, 20));

        emailMsgLb.setForeground(java.awt.Color.red);
        emailMsgLb.setText("Email is invalid!");
        formPn.add(emailMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 340, 20));

        phoneNoMsgLb.setForeground(java.awt.Color.red);
        phoneNoMsgLb.setText("Phone Number is invalid!");
        formPn.add(phoneNoMsgLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 340, 20));

        add(formPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 540, 210));

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

        changePssBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changePssBtt.setText("Change Password");
        changePssBtt.setFocusable(false);
        changePssBtt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        changePssBtt.setPreferredSize(new java.awt.Dimension(200, 50));
        changePssBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePssBttActionPerformed(evt);
            }
        });
        add(changePssBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 290, 180, 35));

        editBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editBtt.setText("Edit Profile");
        editBtt.setFocusable(false);
        editBtt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        editBtt.setPreferredSize(new java.awt.Dimension(200, 50));
        editBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttActionPerformed(evt);
            }
        });
        add(editBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 290, 160, 35));

        titleLb.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLb.setText("Profile");
        add(titleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        phLb.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        phLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phLb.setText("Your Purchase History");
        add(phLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        viewPHBtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewPHBtt.setText("View Purchase History");
        viewPHBtt.setFocusable(false);
        viewPHBtt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        viewPHBtt.setPreferredSize(new java.awt.Dimension(200, 50));
        viewPHBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPHBttActionPerformed(evt);
            }
        });
        add(viewPHBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 555, 190, 35));

        orderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Total Product Type", "Total Price", "Order Date Time", "Delivering Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderHistoryTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        orderHistoryTable.getTableHeader().setReorderingAllowed(false);
        orderHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderHistoryTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(orderHistoryTable);
        if (orderHistoryTable.getColumnModel().getColumnCount() > 0) {
            orderHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            orderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(55);
            orderHistoryTable.getColumnModel().getColumn(2).setPreferredWidth(45);
            orderHistoryTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            orderHistoryTable.getColumnModel().getColumn(4).setPreferredWidth(45);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 530, 150));

        usernameMsgLb1.setText("To view your purchase order in detail, please select one of the row then click the button below");
        add(usernameMsgLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 550, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void editBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttActionPerformed
        if (editBtt.getText().equals("Edit Profile")) {
            editProfileForm();
        } else if (editBtt.getText().equals("Confirm Change")) {
            confirmChangeProfile();
        }
    }//GEN-LAST:event_editBttActionPerformed

    private void backBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttActionPerformed
        OODMS.frame.refresh(new CustomerHomePage());
    }//GEN-LAST:event_backBttActionPerformed

    private void changePssBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePssBttActionPerformed
        JLabel label = new JLabel("Please enter your password:");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setColumns(15);
        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(new Dimension(200, 50));
        panel.add(label);
        panel.add(passwordField);
        while (true) {
            passwordField.setText("");
            int option = JOptionPane.showConfirmDialog(null, panel, "Verify Password", JOptionPane.OK_CANCEL_OPTION);
            if (option != JOptionPane.OK_OPTION) {
                break;
            }
            String pss = new String(passwordField.getPassword());
            if (OODMS.currentUser.getPassword().equals(pss)) {
                OODMS.frame.refresh(new CustomerChangePasswordPage());
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password, please try again!", "Verify Failed", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_changePssBttActionPerformed

    private void viewPHBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPHBttActionPerformed
        if (orderSelected == null) {
            return;
        }
        OODMS.frame.refresh(new CustomerPurchaseHistory(orderSelected));
    }//GEN-LAST:event_viewPHBttActionPerformed

    private void orderHistoryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryTableMousePressed
        int select = orderHistoryTable.getSelectedRow();
        if (select < 0) {
            return;
        }
        long id = (long) orderHistoryTableModel.getValueAt(select, 0);
        Optional<CustomerOrder> customerOrderExist = customerOrderList.stream().filter(order -> order.getId() == id).findFirst();
        if (customerOrderExist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please refresh the page by back and re-enter this page", "Some Error Occured", JOptionPane.ERROR_MESSAGE);
            return;
        }
        orderSelected = customerOrderExist.get();

    }//GEN-LAST:event_orderHistoryTableMousePressed

    private void editProfileForm() {
        editBtt.setText("Confirm Change");
        changePssBtt.setEnabled(false);

        usernameUserLb.setVisible(false);
        emailUserLb.setVisible(false);
        phoneNoUserLb.setVisible(false);

        usernameMsgLb.setText("Username must be at least 4 characters");
        usernameMsgLb.setForeground(Color.BLACK);
        usernameMsgLb.setVisible(true);
        usernameField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        usernameField.setText(usernameUserLb.getText());
        usernameField.setVisible(true);

        emailMsgLb.setVisible(false);
        emailField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        emailField.setText(emailUserLb.getText());
        emailField.setVisible(true);

        phoneNoMsgLb.setVisible(false);
        phoneNoField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        phoneNoField.setText(phoneNoUserLb.getText());
        phoneNoField.setVisible(true);
    }

    private void confirmChangeProfile() {
        usernameMsgLb.setText("Username must be at least 4 characters");
        usernameMsgLb.setForeground(Color.BLACK);
        usernameField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));

        emailMsgLb.setVisible(false);
        emailField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));

        phoneNoMsgLb.setVisible(false);
        phoneNoField.setBorder(BorderFactory.createLineBorder(new Color(51,153,255), 2, true));
        String username = usernameField.getText();
        String email = emailField.getText();
        String phoneNo = phoneNoField.getText();

        if (username.equals(usernameUserLb.getText()) && email.equals(emailUserLb.getText()) && phoneNo.equals(phoneNoUserLb.getText())) {
            resetToViewProfile();
            return;
        }

        String errMsg = Customer.validate(username, email, phoneNo);
        errMsg += username.equals(usernameUserLb.getText()) ? "" : User.checkUserExist(username);

        if (errMsg.isEmpty()) {
            Customer customer = (Customer) OODMS.currentUser;
            customer.setUsername(username);
            customer.setEmail(email);
            customer.setPhoneNo(phoneNo);
            if (customerDao.fileUpdate(customer)) {
                JOptionPane.showMessageDialog(null, "Your profile information successfully change!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is an error occur, your profile information will not be change!", "Failed", JOptionPane.ERROR_MESSAGE);
            }

            resetToViewProfile();
            usernameUserLb.setText(username);
            emailUserLb.setText(email);
            phoneNoUserLb.setText(phoneNo);
            return;
        }

        if (errMsg.contains("System Error")) {
            OODMS.showErrorMessage();
            return;
        }

        if (errMsg.contains("Username character less than 4")) {
            usernameMsgLb.setText("Username invalid, username must be at least 4 characters!");
            usernameMsgLb.setForeground(Color.RED);
            usernameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));

        } else if (errMsg.contains("Username taken")) {
            usernameMsgLb.setText("Username has been taken!");
            usernameMsgLb.setForeground(Color.RED);
            usernameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }

        if (errMsg.contains("Email is invalid")) {
            emailMsgLb.setVisible(true);
            emailField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }

        if (errMsg.contains("Phone number is invalid")) {
            phoneNoMsgLb.setVisible(true);
            phoneNoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        }
    }

    private void resetToViewProfile() {
        editBtt.setText("Edit Profile");
        changePssBtt.setEnabled(true);

        usernameUserLb.setVisible(true);
        emailUserLb.setVisible(true);
        phoneNoUserLb.setVisible(true);

        usernameMsgLb.setVisible(false);
        emailMsgLb.setVisible(false);
        phoneNoMsgLb.setVisible(false);
        usernameField.setVisible(false);
        emailField.setVisible(false);
        phoneNoField.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtt;
    private javax.swing.JButton changePssBtt;
    private javax.swing.JButton editBtt;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLb;
    private javax.swing.JLabel emailMsgLb;
    private javax.swing.JLabel emailUserLb;
    private javax.swing.JPanel formPn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderHistoryTable;
    private javax.swing.JLabel phLb;
    private com.mycompany.oodms.Component.JNumberField phoneNoField;
    private javax.swing.JLabel phoneNoLb;
    private javax.swing.JLabel phoneNoMsgLb;
    private javax.swing.JLabel phoneNoUserLb;
    private javax.swing.JLabel titleLb;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLb;
    private javax.swing.JLabel usernameMsgLb;
    private javax.swing.JLabel usernameMsgLb1;
    private javax.swing.JLabel usernameUserLb;
    private javax.swing.JButton viewPHBtt;
    // End of variables declaration//GEN-END:variables
}
