/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.oodms.Component;

import com.mycompany.oodms.Dao.FileService;
import com.mycompany.oodms.OODMS;
import com.mycompany.oodms.item.Item;
import com.mycompany.oodms.item.ItemDao;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class EditProductForm extends javax.swing.JPanel {

    private final ItemDao itemDao;
    
    public EditProductForm(Item item) {
        itemDao = OODMS.getItemDao();
        initComponents();
        ProCatRad1.setSelected(true);
        ProCatTxt.setEnabled(false);
        NameErrLab.setVisible(false);
        CatErrLab.setVisible(false);
        
        // Setting the select product details
        ProNameTxt.setText(item.getName());
        ProPriceTxt.setText(item.getPrice().toString());
        ProStockTxt.setText(item.getStock().toString());
        ProDesTxt.setText(item.getDescription());
        
        // Add current category into the combo box
        String CurrentCat = itemDao.getCategoryNameById(item.getCategoryId());
        ProCatCom.addItem(CurrentCat);
        
        // Adding existing category to combo box except the curent category
        List<String> allCategory = itemDao.getAllCategoryName();
        
        for (String category : allCategory) {
            if (!category.equals(CurrentCat)) {
                ProCatCom.addItem(category);
            }
        }
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
        jPanel1 = new javax.swing.JPanel();
        ProDesLab = new javax.swing.JLabel();
        ProDesTxt = new javax.swing.JTextField();
        ProNameLab = new javax.swing.JLabel();
        ProNameTxt = new javax.swing.JTextField();
        ProCatLab = new javax.swing.JLabel();
        ProPriceLab = new javax.swing.JLabel();
        ProStockLab = new javax.swing.JLabel();
        ProCatTxt = new javax.swing.JTextField();
        CatErrLab = new javax.swing.JTextField();
        NameErrLab = new javax.swing.JTextField();
        ProCatCom = new javax.swing.JComboBox<>();
        ProCatRad2 = new javax.swing.JRadioButton();
        ProCatRad1 = new javax.swing.JRadioButton();
        ProStockTxt = new com.mycompany.oodms.Component.JNumberField();
        ProPriceTxt = new com.mycompany.oodms.Component.JCurrencyField();

        setPreferredSize(new java.awt.Dimension(588, 385));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLab.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        TitleLab.setText("Modify Product Form");
        add(TitleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProDesLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProDesLab.setText("Description:");
        jPanel1.add(ProDesLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        ProDesTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProDesTxt.setToolTipText("");
        ProDesTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jPanel1.add(ProDesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 340, 30));

        ProNameLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProNameLab.setText("Product Name:");
        jPanel1.add(ProNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        ProNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProNameTxt.setToolTipText("");
        ProNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jPanel1.add(ProNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 340, 30));

        ProCatLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProCatLab.setText("Category:");
        jPanel1.add(ProCatLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        ProPriceLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProPriceLab.setText("Price:");
        jPanel1.add(ProPriceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        ProStockLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProStockLab.setText("Stock:");
        jPanel1.add(ProStockLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        ProCatTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProCatTxt.setToolTipText("");
        ProCatTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(ProCatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, 30));

        CatErrLab.setForeground(new java.awt.Color(255, 0, 51));
        CatErrLab.setText("Category already exist !");
        CatErrLab.setBorder(null);
        jPanel1.add(CatErrLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 140, -1));

        NameErrLab.setForeground(new java.awt.Color(255, 0, 51));
        NameErrLab.setText("Product name is invalid !");
        NameErrLab.setBorder(null);
        jPanel1.add(NameErrLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 340, -1));

        jPanel1.add(ProCatCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 120, 30));

        ProCatRad2.setBackground(new java.awt.Color(255, 255, 255));
        ProCatRad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProCatRad2ActionPerformed(evt);
            }
        });
        jPanel1.add(ProCatRad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 30));

        ProCatRad1.setBackground(new java.awt.Color(255, 255, 255));
        ProCatRad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProCatRad1ActionPerformed(evt);
            }
        });
        jPanel1.add(ProCatRad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 20, 30));

        ProStockTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        ProStockTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProStockTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProStockTxtActionPerformed(evt);
            }
        });
        jPanel1.add(ProStockTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 340, 30));

        ProPriceTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        ProPriceTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(ProPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 340, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 540, 310));
    }// </editor-fold>//GEN-END:initComponents

    public boolean formValidate(Item item) {
        String ProName = ProNameTxt.getText();
        String ProCat = "";
        String ProPriceS = ProPriceTxt.getText();
        String ProStockS = ProStockTxt.getText();
        String ProDes = ProDesTxt.getText();
        if (ProCatRad1.isSelected()) {
            // Getting all the category data to search and append existing category id for the item
            ProCat = (String) ProCatCom.getSelectedItem();
        } else {
            ProCat = ProCatTxt.getText();
        }       
        
        // Check if any field is empty
        String CheckEmpty = Item.validateEmpty(ProName, ProCat, ProPriceS, ProStockS, ProDes);
        if (CheckEmpty.equals("empty")) {
            JOptionPane.showMessageDialog(this, "Please fill in all the text field !");
            return false;
        }
        
        // Change product price and stock to the correct variable
        double ProPrice = Double.parseDouble(ProPriceS);
        int ProStock = Integer.parseInt(ProStockS);
        
        String errorMessage = "";
        // Run validation and add product using Item.addItem method
        if (ProCatRad1.isSelected()) {
            if (!ProName.equals(item.getName())) {
                errorMessage = Item.validateItem(ProName, "CategoryGood");
            }
        } else {
            if (!ProName.equals(item.getName())) {
                errorMessage = Item.validateItem(ProName, ProCat);
            } else {
                errorMessage = Item.validateItem("ItemGood", ProCat);
            }
        }

        // If no error
        if (errorMessage.isEmpty()) {
            // Set everything except category
            item.setName(ProName);
            item.setPrice(ProPrice);
            item.setStock(ProStock);
            item.setDescription(ProDes);
            
            // Set category
            if (ProCatRad1.isSelected()) {
                item.setCategory(Long.valueOf(itemDao.getCategoryIdByName(ProCat)));
            } else {
                // Get new id for category if category does not exist
                Long NewCategoryID = FileService.getNewId(ItemDao.CATEGORY_FILENAME);

                // Append category data into category.txt
                OODMS.getItemDao().addNewCategory(NewCategoryID, ProCat);
                
                item.setCategory(NewCategoryID);
            }
            
            // Modify new data in the text file
            itemDao.fileUpdate(item);
            
            return true;
        }
        
        // If there is any error
        if (errorMessage.contains("ProName_Err1")) {
            NameErrLab.setText("Product Name already exist !");
            NameErrLab.setVisible(true);
            ProNameTxt.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        } else if (errorMessage.contains("ProCat_Err2")) {
            NameErrLab.setText("Invalid Product Name !");
            NameErrLab.setVisible(true);
            ProNameTxt.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        } else {
            NameErrLab.setVisible(false);
            ProNameTxt.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 2, true));
        }
        
        if (ProCatRad2.isSelected()) {
            if (errorMessage.contains("ProCat_Err1")) {
                CatErrLab.setText("Category already exist !");
                CatErrLab.setVisible(true);
                ProCatTxt.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            } else if (errorMessage.contains("ProCat_Err2")) {
                CatErrLab.setText("Invalid category !");
                CatErrLab.setVisible(true);
                ProCatTxt.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            } else {
                CatErrLab.setVisible(false);
                ProCatTxt.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 2, true));
            }
        }
        
        return false;
    }
    
    private void ProCatRad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProCatRad2ActionPerformed
        if (ProCatRad2.isSelected()) {
            ProCatRad1.setSelected(false);
            ProCatCom.setEnabled(false);
            ProCatTxt.setEnabled(true);
            ProCatTxt.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 2, true));
            ProCatCom.setForeground(new Color(183, 206, 233));
        } else {
            ProCatRad2.setSelected(true);
        }
    }//GEN-LAST:event_ProCatRad2ActionPerformed

    private void ProCatRad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProCatRad1ActionPerformed
        if (ProCatRad1.isSelected()) {
            ProCatRad2.setSelected(false);
            ProCatTxt.setEnabled(false);
            ProCatCom.setEnabled(true);
            ProCatTxt.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true));
            ProCatCom.setForeground(new Color(0, 0, 0));
            CatErrLab.setVisible(false);
        } else {
            ProCatRad1.setSelected(true);
        }
    }//GEN-LAST:event_ProCatRad1ActionPerformed

    private void ProStockTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProStockTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProStockTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatErrLab;
    private javax.swing.JTextField NameErrLab;
    private javax.swing.JComboBox<String> ProCatCom;
    private javax.swing.JLabel ProCatLab;
    private javax.swing.JRadioButton ProCatRad1;
    private javax.swing.JRadioButton ProCatRad2;
    private javax.swing.JTextField ProCatTxt;
    private javax.swing.JLabel ProDesLab;
    private javax.swing.JTextField ProDesTxt;
    private javax.swing.JLabel ProNameLab;
    private javax.swing.JTextField ProNameTxt;
    private javax.swing.JLabel ProPriceLab;
    private com.mycompany.oodms.Component.JCurrencyField ProPriceTxt;
    private javax.swing.JLabel ProStockLab;
    private com.mycompany.oodms.Component.JNumberField ProStockTxt;
    private javax.swing.JLabel TitleLab;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
