/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GraphicMx
 */
public class AddMedicine extends javax.swing.JFrame {

    /**
     * Creates new form AddMedicine
     */
    
    public AddMedicine() {
        
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

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        medName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        compName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        savemedicine = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(239, 131, 84));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 49, 66));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Medicine");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 320, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medicine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, -1));

        medID.setBackground(new java.awt.Color(45, 49, 66));
        medID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medID.setForeground(new java.awt.Color(255, 255, 255));
        medID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        medID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIDActionPerformed(evt);
            }
        });
        jPanel1.add(medID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 219, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        medName.setBackground(new java.awt.Color(45, 49, 66));
        medName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medName.setForeground(new java.awt.Color(255, 255, 255));
        medName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(medName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 219, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, -1));

        compName.setBackground(new java.awt.Color(45, 49, 66));
        compName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        compName.setForeground(new java.awt.Color(255, 255, 255));
        compName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(compName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 219, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 94, -1));

        Quantity.setBackground(new java.awt.Color(45, 49, 66));
        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        Quantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 222, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 60, -1));

        Type.setBackground(new java.awt.Color(45, 49, 66));
        Type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Type.setForeground(new java.awt.Color(255, 255, 255));
        Type.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 222, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 70, -1));

        Price.setBackground(new java.awt.Color(45, 49, 66));
        Price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 219, 30));

        savemedicine.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        savemedicine.setForeground(new java.awt.Color(239, 131, 84));
        savemedicine.setText("Save");
        savemedicine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        savemedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savemedicineActionPerformed(evt);
            }
        });
        jPanel1.add(savemedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 140, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savemedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savemedicineActionPerformed
        // TODO add your handling code here:
        String id = medID.getText();
        String name = medName.getText();
        String companyName = compName.getText();
        String quantity = Quantity.getText();
        String price = Price.getText();
        String type = Type.getText();

        String regex = "^[a-zA-Z]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(this.medName.getText());

        String regexno = "^[0-9]{3}";
        Pattern pat = Pattern.compile(regexno);
        Matcher mat = pat.matcher(this.medID.getText());

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydistributionsystem?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            PreparedStatement ps = con.prepareStatement ("Insert into medicine(MedicineID, MedicineName, CompanyName, Price, Quantity, Type) value(?,?,?,?,?,?)");
            ps.setString(1,id);
            ps.setString(2,name );
            ps.setString(3,companyName);
            ps.setString(4,price );
            ps.setString(5, quantity);
            ps.setString(6, type);

            medName.setText("");
            medID.setText("");
            compName.setText("");
            Quantity.setText("");
            Price.setText("");
            Type.setText("");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,  "Medicine Added!");
            setVisible(false);
            new AddMedicine().setVisible(true);
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_savemedicineActionPerformed

   
    private void medIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DashBoard().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
                new DashBoard().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Type;
    private javax.swing.JTextField compName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField medID;
    private javax.swing.JTextField medName;
    private javax.swing.JButton savemedicine;
    // End of variables declaration//GEN-END:variables
}