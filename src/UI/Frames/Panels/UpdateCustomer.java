package UI.Frames.Panels;


import com.placeholder.PlaceHolder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Connection.*;
import Classes.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class UpdateCustomer extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomer
     */
//    Customer customer;
    Customer_CRUD ccrud;
    String fname = "";
    String lname = "";
    int ID = 0;
    int phone = 0;
    String Address = "";
    DefaultTableModel tableModel = new DefaultTableModel();

    public UpdateCustomer() {
        initComponents();
        tableModel.addColumn("ID");
        tableModel.addColumn("F_Name");
        tableModel.addColumn("L_Name");
        tableModel.addColumn("customent_number");
        tableModel.addColumn("customer_address");
        jTable1.setModel(tableModel);
        try {
            String ConnectionSql = "jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;";
            Connection conn = DriverManager.getConnection(ConnectionSql);
            java.sql.Statement st = conn.createStatement();
            //            
            String sql = "select * from customer";
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {

                tableModel.addRow(new String[]{
                    String.valueOf(res.getInt(1)),
                    res.getString(2),
                    res.getString(3),
                    String.valueOf(res.getInt(4)),
                    res.getString(5)
                });
            }

            st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldLS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(14, 2, 16));
        setMinimumSize(new java.awt.Dimension(860, 510));
        setPreferredSize(new java.awt.Dimension(860, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 2, 16));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 510));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, -1));

        jLabel7.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update Customer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        PlaceHolder holder = new PlaceHolder(jTextFieldID, "Please enter Customer ID");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 30));

        PlaceHolder holder1= new PlaceHolder(jTextFieldFn, "Please enter Customer First Name");
        jTextFieldFn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, 30));

        jLabel8.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.setPreferredSize(new java.awt.Dimension(140, 52));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        PlaceHolder holder4 = new PlaceHolder(jTextFieldAddress, "Please enter your Customer Address");
        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 130, 30));

        PlaceHolder holder2 = new PlaceHolder(jTextFieldLS, "Please enter your Customer Last Name");
        jTextFieldLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLSActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, 32));

        jLabel11.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 111, -1));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 100, -1));

        PlaceHolder holder3 = new PlaceHolder(jTextFieldPhone, "Please enter Customer Phone number");
        jPanel1.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 590, 380));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldFnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            Customer customer = new Customer(ID, fname, lname, phone, Address);

            try {
                ID = Integer.parseInt(jTextFieldID.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID should be numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            try {
                fname = jTextFieldFn.getText().trim();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Name should be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            try {
                lname = jTextFieldLS.getText().trim();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Name should be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            try {
                phone = Integer.parseInt(jTextFieldPhone.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter A valid phone number", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Address = jTextFieldAddress.getText().trim();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Address be letters", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            customer.setCustomer_fN(fname);
            customer.setCustomer_lN(lname);
            customer.setCustomer_ID(ID);
            customer.setCustoment_number(phone);
            customer.setCustomer_address(Address);
            Customer_CRUD.updateCustomerdata(customer);

            JOptionPane.showMessageDialog(null, "Added Succsesfully", "ADD", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

    private void jTextFieldLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLSActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tableModel = new DefaultTableModel();
        // get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        // set the selected row data into jtextfields
        jTextFieldID.setText(this.tableModel.getValueAt(selectedRowIndex, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldFn;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLS;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}