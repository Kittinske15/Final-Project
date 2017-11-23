package gui;

import Codes.UserList;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        getContentPane().setBackground(new Color(204,204,204));        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Password = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1190, 740));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 510, 130, 70);

        Password.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Password.setForeground(new java.awt.Color(51, 51, 0));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(360, 380, 536, 50);

        Username.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Username.setForeground(new java.awt.Color(51, 51, 0));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username);
        Username.setBounds(360, 310, 536, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton2.setText("Sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 510, 150, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RESTAURANT POS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 60, 430, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setText("USERNAME :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 310, 180, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setText("PASSWORD :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 380, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Background/spice_spoons_detail (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 740);

        setBounds(400, 150, 1128, 744);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          if (UserList.getthatUser(Username.getText()) && UserList.getthatPass(Password.getText())) {
              try {
                  new Table().setVisible(true);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              } catch (InstantiationException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IllegalAccessException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              } catch (UnsupportedLookAndFeelException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              }
                this.dispose();
             } else {
              JFrame error = new JFrame("Problem");
                 error.setSize(401, 401);
              JOptionPane.showMessageDialog(error, "Username or Password is wrong!");
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new signUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
        
    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
            
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
