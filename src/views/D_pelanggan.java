package views;

import javax.swing.JInternalFrame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.*;
import koneksi.config;
import java.util.logging.*;
import static koneksi.config.conn;

/**
 *
 * @author Bhuwana
 */
public class D_pelanggan extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabmodel;
    
    Connection conn = koneksi.config.Conn();

    public D_pelanggan() {
        initComponents();
        judul();
        AutoKode();
        tampil();
        reset();
        hapus.setEnabled(false);
        update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kd_pln = new javax.swing.JTextField();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        p = new javax.swing.JRadioButton();
        l = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpelanggan = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        update = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_People_50px.png"))); // NOI18N
        jLabel3.setText("Data Pelanggan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 370, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kode Pelanggan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(kd_pln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 30));

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 220, 30));

        alamat.setColumns(15);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        btngrup.add(p);
        p.setText("P");
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        btngrup.add(l);
        l.setText("L");
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        tpelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kd Pelanggan", "Nama", "Jenis Kelamin", "Alamat"
            }
        ));
        tpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpelangganMouseClicked(evt);
            }
        });
        tpelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpelangganKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tpelanggan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 370, 380));

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 70, -1));

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 70, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, 30));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 40, 30));

        jLabel9.setText("Back");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Form Penjualan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(899, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void judul(){
        Object[] judul = {"Kd Pelanggan","Nama","JK","Alamat"};
        tabmodel = new DefaultTableModel(null,judul){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tpelanggan.setModel(tabmodel);
    }
    
    public void AutoKode(){
           try{
                rs = conn.createStatement().executeQuery("SELECT * FROM pelanggan ORDER BY kd_pelanggan DESC");
                if(rs.next()){
                    String kode = rs.getString("kd_pelanggan").substring(3);
                     String AN = "" + (Integer.parseInt(kode) + 1);
                     String Nol = "";
                    
                    if(AN.length() == 1){
                      Nol = "000";
                    }
                    else if(AN.length() == 2){
                        Nol = "00";
                    }
                    else if(AN.length() == 3){
                         Nol = "0";
                    }
                    else if(AN.length() == 4){
                        Nol = "";
                    }
                    kd_pln.setText("PL" + Nol + AN);
                }
                else{
                    kd_pln.setText("PL0001");
                }
                kd_pln.enable(false);
                rs.close();
           }
           catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    
    public void tampil(){
        try {
            st = conn.createStatement();
            tabmodel.getDataVector().removeAllElements();
            tabmodel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM pelanggan");
            while (rs.next()) {
                Object[] data = {
                    rs.getString("kd_pelanggan"),
                    rs.getString("nama_pelanggan"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("alamat"),
                };
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void reset(){
        nama.setText("");
        btngrup.clearSelection();
        alamat.setText("");
        
        hapus.setEnabled(false);
        update.setEnabled(false);
    }
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Form_admin fa = new Form_admin();
        fa.show();
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        if(l.isSelected() == false && p.isSelected() == false){
            JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
        }
        else if(kd_pln.getText().toString().equals("") || nama.getText().toString().equals("") || alamat.getText().toString().equals("")){
           JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
        }
        else{
            conn = config.Conn();
            try {
                String hasil;
                if (l.isSelected()) {
                    hasil = "L";
                }
                else{
                    hasil = "P";
                }
                st = conn.createStatement();
                st.executeUpdate("INSERT INTO pelanggan SET " + " kd_pelanggan='"+ kd_pln.getText() +"', nama_pelanggan='"+ nama.getText() +"', jenis_kelamin='"+ hasil +"', alamat='"+ alamat.getText() +"'");
                judul();
                tampil();
                JOptionPane.showMessageDialog(null, "Data Berhasil di Input");
                AutoKode();
                btngrup.clearSelection();
                nama.setText("");
                alamat.setText("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        conn = config.Conn();
        try {
            String hasil;
                if (l.isSelected()) {
                    hasil = "L";
                }
                else{
                    hasil = "P";
                }
            st = conn.createStatement();
            st.executeUpdate("UPDATE pelanggan SET " + " nama_pelanggan='"+ nama.getText() +"', jenis_kelamin='"+ hasil +"', alamat='"+ alamat.getText() +"' WHERE kd_pelanggan='"+ kd_pln.getText() +"'");
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
            tampil();
            reset();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tpelangganKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpelangganKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tpelangganKeyReleased

    private void tpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpelangganMouseClicked
        kd_pln.setText(tabmodel.getValueAt(tpelanggan.getSelectedRow(), 0)+ "");
        nama.setText(tabmodel.getValueAt(tpelanggan.getSelectedRow(), 1)+ "");
        switch(tabmodel.getValueAt(tpelanggan.getSelectedRow(), 2).toString()){
            case "L" :
                l.setSelected(true);
                break;
            case "P" :
                p.setSelected(true);
                break;
        }
        alamat.setText(tabmodel.getValueAt(tpelanggan.getSelectedRow(), 3)+ "");
        tambah.setEnabled(false);
        update.setEnabled(true);
        hapus.setEnabled(true);
    }//GEN-LAST:event_tpelangganMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        conn = config.Conn();
        try {
            st = conn.createStatement();
            st.executeUpdate("DELETE FROM pelanggan WHERE" + " kd_pelanggan='"+ tabmodel.getValueAt(tpelanggan.getSelectedRow(), 0) +"'");
            int a = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
                tampil();
                reset();
                AutoKode();
                tambah.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        if(l.isSelected() == false && p.isSelected() == false){
            JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
        }
        else if(kd_pln.getText().toString().equals("") || nama.getText().toString().equals("") || alamat.getText().toString().equals("")){
           JOptionPane.showMessageDialog(null,"Silahkan Lengkapi Data!");
        }
        else{
            reset();
            AutoKode();
            tambah.setEnabled(true);
        }
    }//GEN-LAST:event_resetActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        conn = config.Conn();
        try {
            st = conn.createStatement();
            tabmodel.getDataVector().removeAllElements();
            tabmodel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM pelanggan WHERE kd_pelanggan like '%" + cari.getText() + "%' or nama_pelanggan like '%" + cari.getText() + "%' or jenis_kelamin like '%" + cari.getText() + "%' or alamat like '%" + cari.getText() + "%'");
            while (rs.next()) {                
                Object[] data = {
                    rs.getString("kd_pelanggan"),
                    rs.getString("nama_pelanggan"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("alamat"),
                };
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cariKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D_pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.ButtonGroup btngrup;
    private javax.swing.JTextField cari;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kd_pln;
    private javax.swing.JRadioButton l;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton p;
    private javax.swing.JButton reset;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tpelanggan;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
