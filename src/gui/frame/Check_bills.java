package gui.frame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import model.TableManager;

public class Check_bills extends javax.swing.JFrame {

    private String number;

    public Check_bills(String tablenum) {
        initComponents();
        pay.setEnabled(false);
        this.number = tablenum;
    }
    double sum = 0;

    public void Calculator(double input) {
        sum += input;
        pay.setText(String.format("%.2f ", sum));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ChangeButt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        change = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESTAURANT POS (made by Kit&Bank)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Check Bills");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/500.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 70));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/m169335.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 70));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/724656.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, 70));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/2711_thailand_50_neu-1.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 70));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/thb-20-thai-bahts-2.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 130, 70));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/10.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 130, 70));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/5_baht_reverse_(2008).png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, 80));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/1.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 80, 80));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/25stang.jpg"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 80, 80));

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/50stang.jpg"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 80, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money/2000px-Small_arrow_pointing_left.svg.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 200, 40));

        ChangeButt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChangeButt.setText("Change");
        ChangeButt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtActionPerformed(evt);
            }
        });
        getContentPane().add(ChangeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Background/stucco_texture2035.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        change.setEditable(false);
        change.setColumns(20);
        change.setRows(5);
        jScrollPane1.setViewportView(change);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 90));

        pay.setEditable(false);
        pay.setColumns(20);
        pay.setRows(5);
        jScrollPane2.setViewportView(pay);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 90));

        setBounds(700, 180, 497, 647);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Calculator(1000);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Calculator(500);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Calculator(100);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Calculator(50);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Calculator(20);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Calculator(10);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Calculator(5);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Calculator(1);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Calculator(0.50);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Calculator(0.25);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sum = 0;
        pay.setText(String.format("", sum));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChangeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtActionPerformed
        try {
            TableManager.resetText(number);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableManager.resetMap();
    }//GEN-LAST:event_ChangeButtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButt;
    private javax.swing.JTextArea change;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pay;
    // End of variables declaration//GEN-END:variables
}
