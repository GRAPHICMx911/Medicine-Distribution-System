/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author GraphicMx
 */

import javax.swing.JOptionPane;
import java.util.regex.*;

public class LoginSystem extends javax.swing.JFrame {

    /**
     * Creates new form LoginSystem
     */
    public LoginSystem() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(45, 49, 66));
        jPanel1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel1HierarchyChanged(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, 30));

        UserNameField.setBackground(new java.awt.Color(239, 131, 84));
        UserNameField.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UserNameField.setForeground(new java.awt.Color(255, 255, 255));
        UserNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Log In");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, 50));

        LogInButton.setBackground(new java.awt.Color(191, 192, 192));
        LogInButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(45, 49, 66));
        LogInButton.setText("Log In");
        LogInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 49, 66), 1, true));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 40));

        jPasswordField1.setBackground(new java.awt.Color(239, 131, 84));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(45, 49, 66));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine Distribution System");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(45, 49, 66));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
        // TODO add your handling code here:
         this.hide();
     DashBoard frm= new DashBoard();
     frm.setVisible(true);
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
//        password();
   String userNamePattern = "^[a-zA-Z]";
        Pattern userPattern = Pattern.compile(userNamePattern);
        Matcher userNameMatcher = userPattern.matcher(this.UserNameField.getText());
        
          String userPasswordPattern = "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[^a-zA-Z\\d]).{8,}$";
        Pattern passwordPattern = Pattern.compile(userPasswordPattern);
        Matcher userPasswordMatcher = passwordPattern.matcher(jPasswordField1.getText());
        
        String userName = UserNameField.getText();
              String Password = jPasswordField1.getText();
            
 

if(userName.isEmpty()&&Password.isEmpty()){
 JOptionPane.showMessageDialog(this,"please enter username and password");
}
             else  if (userName.equals("muneeb")&& Password.equals("muneeb911")){
                  DashBoard a = new DashBoard();
        this.hide();
        a.setVisible(true);
              }
              else  if (userName.equals("nayab")&& Password.equals("nayab765")){
                  DashBoard a = new DashBoard();
        this.hide();
        a.setVisible(true);
              }
              else{
                  JOptionPane.showMessageDialog(this,"username or password donot match");
              }
//public void password()
//{
//    
//}
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void jPanel1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1HierarchyChanged

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
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSystem().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
