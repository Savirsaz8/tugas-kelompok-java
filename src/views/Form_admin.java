package views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhuwana
 */
public class Form_admin extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabmodel;
    
    Connection conn = koneksi.config.Conn();
    public Form_admin() {
        initComponents();
        new Thread(){
            public void run(){
                while (true) {                    
                    Calendar kal = new GregorianCalendar();
                    int tahun = kal.get(Calendar.YEAR);
                    int bulan = kal.get(Calendar.MONTH)+1;
                    int hari  = kal.get(Calendar.DAY_OF_MONTH);
                    
                    String tanggal = hari + "-" + bulan + "-" + tahun;
                    
                    jLabel4.setText(tanggal);
                }
            }
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bbuku = new javax.swing.JButton();
        bpelanggan = new javax.swing.JButton();
        btrans = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bdis = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Businessman_48px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        bbuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Books_48px_1.png"))); // NOI18N
        bbuku.setText("Input Buku");
        bbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbukuActionPerformed(evt);
            }
        });
        getContentPane().add(bbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 110));

        bpelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_People_50px.png"))); // NOI18N
        bpelanggan.setText("Input Pelanggan");
        bpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpelangganActionPerformed(evt);
            }
        });
        getContentPane().add(bpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 190, 110));

        btrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Cash_in_Hand_50px.png"))); // NOI18N
        btrans.setText("Transaksi");
        btrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btransActionPerformed(evt);
            }
        });
        getContentPane().add(btrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 190, 110));

        jLabel3.setText("LOGOUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 100, 40));

        bdis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ratings_50px.png"))); // NOI18N
        bdis.setText("Input Distributor");
        bdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdisActionPerformed(evt);
            }
        });
        getContentPane().add(bdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 180, 110));

        laporan.setText("Laporan Buku");
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        getContentPane().add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 160, 40));

        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 70, 20));

        setSize(new java.awt.Dimension(888, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Yakin ingin logout?", "Informasi", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            login l = new login();
            l.show();
            this.dispose();
        }       
    }//GEN-LAST:event_jLabel3MouseClicked

    private void bdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdisActionPerformed
        D_distributor dd = new D_distributor();
        dd.show();
        this.dispose();
    }//GEN-LAST:event_bdisActionPerformed

    private void bbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbukuActionPerformed
        D_buku db = new D_buku();
        db.show();
        this.dispose();
    }//GEN-LAST:event_bbukuActionPerformed

    private void bpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpelangganActionPerformed
        D_pelanggan dp = new D_pelanggan();
        dp.show();
        this.dispose();
    }//GEN-LAST:event_bpelangganActionPerformed

    private void btransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btransActionPerformed
        form_beli fb = new form_beli();
        fb.show();
        this.dispose();
    }//GEN-LAST:event_btransActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        try {
            t_report();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_laporanActionPerformed
    public void t_report(){
            String reportSource = null;
            String reportDest = null;
    }
   
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
            java.util.logging.Logger.getLogger(Form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuku;
    private javax.swing.JButton bdis;
    private javax.swing.JButton bpelanggan;
    private javax.swing.JButton btrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton laporan;
    // End of variables declaration//GEN-END:variables
}
