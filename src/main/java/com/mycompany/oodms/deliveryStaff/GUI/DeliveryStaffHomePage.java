/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.deliveryStaff.GUI;

import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.user.GUI.HomePage;

/**
 *
 * @author USER
 */
public class DeliveryStaffHomePage extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryStaffHomePage
     */
    public DeliveryStaffHomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();
        LogoutBut = new javax.swing.JButton();
        ViewDeliveryOrderBut = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 295));
        setPreferredSize(new java.awt.Dimension(600, 295));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLab.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        TitleLab.setText("Home Page");
        add(TitleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Delivery Staff");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        ExitBut.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ExitBut.setText("Exit");
        ExitBut.setFocusable(false);
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });
        add(ExitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 60, -1));

        LogoutBut.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        LogoutBut.setText("Logout");
        LogoutBut.setFocusable(false);
        LogoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButActionPerformed(evt);
            }
        });
        add(LogoutBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        ViewDeliveryOrderBut.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        ViewDeliveryOrderBut.setText("View Delivery Order");
        ViewDeliveryOrderBut.setFocusable(false);
        ViewDeliveryOrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDeliveryOrderButActionPerformed(evt);
            }
        });
        add(ViewDeliveryOrderBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        OODMS.frame.dispose();
    }//GEN-LAST:event_ExitButActionPerformed

    private void LogoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButActionPerformed
        OODMS.currentUser = null;
        OODMS.frame.refresh(new HomePage());
    }//GEN-LAST:event_LogoutButActionPerformed

    private void ViewDeliveryOrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDeliveryOrderButActionPerformed
        OODMS.frame.refresh(new ViewDeliveryOrderPage());
    }//GEN-LAST:event_ViewDeliveryOrderButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton LogoutBut;
    private javax.swing.JLabel TitleLab;
    private javax.swing.JButton ViewDeliveryOrderBut;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}