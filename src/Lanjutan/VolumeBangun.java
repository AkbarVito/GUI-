/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanjutan;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VolumeBangun extends javax.swing.JFrame {

    /**
     * Creates new form VolumeBangun
     */
    public VolumeBangun() {
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

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        txtT = new javax.swing.JTextField();
        txtL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtJ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lanjutan/mate.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 26, 370, 24);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Masukkan Panjang :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 140, 19);

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" Masukkan Lebar    :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 140, 19);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Masukkan Tinggi    :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 140, 19);

        txtP.setBackground(new java.awt.Color(102, 255, 102));
        txtP.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txtP);
        txtP.setBounds(160, 30, 105, 31);

        txtT.setBackground(new java.awt.Color(102, 255, 102));
        txtT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txtT);
        txtT.setBounds(160, 110, 105, 31);

        txtL.setBackground(new java.awt.Color(102, 255, 102));
        txtL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLActionPerformed(evt);
            }
        });
        jPanel1.add(txtL);
        txtL.setBounds(160, 70, 105, 31);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 40, 20, 19);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("cm");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 80, 20, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("cm");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 110, 20, 19);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Hitung Volume");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 160, 115, 26);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lanjutan/mate.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 0, 300, 220);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Masukkan Panjang Sisi :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(34, 35, 180, 19);

        txtS.setBackground(new java.awt.Color(102, 255, 102));
        txtS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel2.add(txtS);
        txtS.setBounds(34, 57, 115, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("cm");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(152, 64, 20, 19);

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Hitung Volume");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(34, 93, 115, 26);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lanjutan/mate.jpg"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 0, 300, 220);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel4.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(153, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Masukkan Panjang Jari - Jari :");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(34, 35, 208, 19);

        txtJ.setBackground(new java.awt.Color(102, 255, 102));
        txtJ.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel4.add(txtJ);
        txtJ.setBounds(34, 57, 115, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("cm");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(152, 64, 20, 19);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Hitung Volume");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(34, 93, 115, 26);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lanjutan/mate.jpg"))); // NOI18N
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 0, 300, 220);

        jTabbedPane1.addTab("Bola", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 420, 260);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lanjutan/math.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, -30, 460, 400);

        setSize(new java.awt.Dimension(477, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int p,l,t,h;

        p = Integer.parseInt(txtP.getText());
        l = Integer.parseInt(txtL.getText());
        t = Integer.parseInt(txtT.getText());
        h = p*l*t;
        try {
            JOptionPane.showMessageDialog(null,"Volume Balok Adalah : "+h+" cm3"," Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error : "+e, "Gagal", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int s, h;

        s = Integer.parseInt(txtS.getText());
        h = s*s*s;

        try {
            JOptionPane.showMessageDialog(null,"Volume Kubus Adalah : "+h+" cm3"," Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error : "+e, "Gagal", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float j;
        j = Integer.parseInt(txtJ.getText());
        float h = (float) (4/3*3.14*j*j*j);
        try {
            JOptionPane.showMessageDialog(null,"Volume Bola Adalah : "+h+" cm3"," Volume", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error : "+e, "Gagal", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLActionPerformed

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
            java.util.logging.Logger.getLogger(VolumeBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolumeBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolumeBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolumeBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolumeBangun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtJ;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtT;
    // End of variables declaration//GEN-END:variables
}
