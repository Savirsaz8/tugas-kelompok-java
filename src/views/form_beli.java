package views;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.table.*;

/**
 *
 * @author Bhuwana
 */
public class form_beli extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabmodel;
    public DefaultTableModel tabmodel1;
    public DefaultTableModel tabmodel2;
    
    
    Connection conn = koneksi.config.Conn();
    public form_beli() {
        initComponents();
        AutoKodePre();
        AutoKodeTrans();
        judulbuku();
        tampild_buku();
        jpelanggan();
        tampild_pln();
        jkeranjang();
        tampil_keranjang();
        reset();
        batal.setEnabled(false);
        selesai.setEnabled(false);
        finish.setEnabled(false);
        tharga.setEnabled(false);
        tbl_pelanggan.setModel(tabmodel1);
        tbl_buku.setModel(tabmodel);
        tbl_keranjang.setModel(tabmodel2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pelanggan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pretransaksi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        transaksi = new javax.swing.JTextField();
        pelanggan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buku = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        stok_tampung = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_keranjang = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        selesai = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        angsulan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        kembali = new javax.swing.JLabel();
        pembeli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        finish = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pelanggan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 203, 140));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Pelanggan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 105, 21));

        tbl_buku.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_buku);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 52, 203, 140));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Buku");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 20, 105, 21));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kode Pesan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 95, 21));

        pretransaksi.setBackground(new java.awt.Color(204, 204, 255));
        pretransaksi.setEnabled(false);
        jPanel1.add(pretransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 151, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kode Transaksi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 95, 21));

        transaksi.setBackground(new java.awt.Color(204, 204, 255));
        transaksi.setForeground(new java.awt.Color(0, 0, 255));
        transaksi.setEnabled(false);
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 151, 30));
        jPanel1.add(pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 151, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kode Pelanggan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 95, 21));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kode Buku");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 95, 21));
        jPanel1.add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 151, 30));

        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahKeyTyped(evt);
            }
        });
        jPanel1.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 151, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Jumlah");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 95, 21));
        jPanel1.add(tharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 151, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Harga");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 95, 21));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 95, 21));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 209, 30));

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Shopping Cart_20px.png"))); // NOI18N
        tambah.setText("Add to Cart");
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
        });
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        tambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tambahKeyReleased(evt);
            }
        });
        jPanel1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 260, 40));

        stok_tampung.setBackground(new java.awt.Color(255, 255, 255));
        stok_tampung.setForeground(new java.awt.Color(255, 255, 255));
        stok_tampung.setText("jLabel17");
        jPanel1.add(stok_tampung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 610));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_keranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_keranjangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_keranjang);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 101));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Shopping Cart_20px.png"))); // NOI18N
        jLabel10.setText("Keranjang");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 105, 21));

        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        jPanel2.add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 101, 36));

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel2.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 101, 36));

        angsulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angsulanActionPerformed(evt);
            }
        });
        jPanel2.add(angsulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 151, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Harga");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 228, 95, 21));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bayar");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 296, 95, 21));
        jPanel2.add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 255, 151, 30));

        kembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kembali.setText("Kembalian");
        jPanel2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 95, 21));
        jPanel2.add(pembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 151, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nama Pembeli");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 95, 21));
        jPanel2.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 323, 151, 30));

        finish.setText("Transaksi Selesai");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel2.add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 167, 39));
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 20));

        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 67, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 540, 610));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Form Penjualan");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Transaction_64px.png"))); // NOI18N
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(359, 359, 359))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        setSize(new java.awt.Dimension(1008, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void AutoKodePre(){
           try{
                rs = conn.createStatement().executeQuery("SELECT * FROM penjualan ORDER BY kd_pretransaksi DESC");
                if(rs.next()){
                    String kode = rs.getString("kd_pretransaksi").substring(3);
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
                    pretransaksi.setText("PS" + Nol + AN);
             
                }
                else{
                    pretransaksi.setText("PS0001");
                }
              
                rs.close();
                
           }
           catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            } 
            
        }
    
    public void AutoKodeTrans(){
           try{
                rs = conn.createStatement().executeQuery("SELECT * FROM penjualan2 ORDER BY kd_transaksi DESC");
                if(rs.next()){
                    String kode = rs.getString("kd_transaksi").substring(3);
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
                    transaksi.setText("TR" + Nol + AN);
             
                }
                else{
                    transaksi.setText("TR0001");
                }
               
                rs.close();
                
           }
           catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        if (pelanggan.getText().equals("") || buku.getText().equals("") || tharga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data...");
        }
        try {
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO penjualan SET " + " kd_pretransaksi='"+ pretransaksi.getText() +"', kd_transaksi='"+ transaksi.getText() +"', kd_pelanggan='"+ pelanggan.getText() +"', kd_buku='"+ buku.getText() +"', jumlah='"+ jumlah.getText() +"', sub_total='"+ total.getText() +"'");
            JOptionPane.showMessageDialog(null, "Berhasil Di Tambah Ke Keranjang");
            tampil_keranjang();
            reset();
            batal.setEnabled(true);
            selesai.setEnabled(true);
            finish.setEnabled(true);
            int pilih = JOptionPane.showConfirmDialog(null,"Beli Lagi ?","Confimation",JOptionPane.YES_NO_OPTION);
            if(pilih == JOptionPane.YES_OPTION){
           
            AutoKodePre();
            tampild_buku();
            jkeranjang();
            tampil_keranjang();
            reset();
            batal.setEnabled(true);
            selesai.setEnabled(true);
            finish.setEnabled(true);
            }
            else{
                AutoKodePre();
                tampild_buku();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Form_admin fa = new Form_admin();
        fa.show();
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void tambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahKeyReleased
    public void judulbuku(){
        Object[] judul = {"kd Buku","Judul","Stok","HargaJual"};
        tabmodel = new DefaultTableModel(null,judul){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_buku.setModel(tabmodel);
        
    }
    
    public void jkeranjang(){
        Object[] judul = {"Kode Pretransaksi","Kode Transaksi","Kode Pelanggan","Kode Buku","Jumlah","Sub Total"};
        tabmodel2 = new DefaultTableModel(null,judul){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_keranjang.setModel(tabmodel2);
    }
    
    public void tampil_keranjang(){
        try {
            st = conn.createStatement();
            tabmodel2.getDataVector().removeAllElements();
            tabmodel2.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM penjualan");
            while (rs.next()) {                
                Object[] data = {
                    rs.getString("kd_pretransaksi"),
                    rs.getString("kd_transaksi"),
                    rs.getString("kd_pelanggan"),
                    rs.getString("kd_buku"),
                    rs.getString("jumlah"),
                    rs.getString("sub_total"),
                };
                tabmodel2.addRow(data);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tampild_buku(){
        try {
            st = conn.createStatement();
            tabmodel.getDataVector().removeAllElements();
            tabmodel.fireTableDataChanged();
            rs = st.executeQuery("SELECT kd_buku,judul,stok,harga_jual FROM buku");
            while (rs.next()) {                
                Object[] data = {
                    rs.getString("kd_buku"),
                    rs.getString("judul"),
                    rs.getString("stok"),
                    rs.getString("harga_jual"),
                };
                tabmodel.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void jpelanggan(){
        Object[] judul = {"kd Pelanggan","Nama"};
        tabmodel1 = new DefaultTableModel(null,judul){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_pelanggan.setModel(tabmodel1);
    }
    
    public void tampild_pln(){
        try {
            st = conn.createStatement();
            tabmodel1.getDataVector().removeAllElements();
            tabmodel1.fireTableDataChanged();
            rs = st.executeQuery("SELECT kd_pelanggan,nama_pelanggan FROM pelanggan");
            while (rs.next()) {
                Object[] data = {
                    rs.getString("kd_pelanggan"),
                    rs.getString("nama_pelanggan"),
                };
                tabmodel1.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void reset(){
        pelanggan.setText("");
        buku.setText("");
        jumlah.setText("");
        tharga.setText("");
        total.setText("");
    }
    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked

    }//GEN-LAST:event_tambahMouseClicked

    private void tbl_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bukuMouseClicked
        buku.setText(tabmodel.getValueAt(tbl_buku.getSelectedRow(), 0).toString());
        stok_tampung.setText(tabmodel.getValueAt(tbl_buku.getSelectedRow(),2).toString());
        tharga.setText(tabmodel.getValueAt(tbl_buku.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tbl_bukuMouseClicked

    private void tbl_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pelangganMouseClicked
        pelanggan.setText(tabmodel1.getValueAt(tbl_pelanggan.getSelectedRow(), 0) + "");
        pembeli.setText(tabmodel1.getValueAt(tbl_pelanggan.getSelectedRow(), 1) + "");
    }//GEN-LAST:event_tbl_pelangganMouseClicked

    private void jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyReleased
        if (pelanggan.getText().equals("") || buku.getText().equals("") || tharga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data");
        }
        else{
            if (jumlah.getText().toString().equals("")) {
                jumlah.setText("");
                total.setText("");
            }
            else{
                int stok = Integer.parseInt(String.valueOf(stok_tampung.getText()));
                int a    = Integer.parseInt(String.valueOf(jumlah.getText()));
                int b    = Integer.parseInt(String.valueOf(tharga.getText()));
                
                if (a > stok) {
                    JOptionPane.showMessageDialog(null, "Stok Hanya Tersedia " + stok);
                }
                else{
                    int jumlah = a * b;
                    total.setText(String.valueOf(jumlah));
                }
            }
        }
    }//GEN-LAST:event_jumlahKeyReleased

    private void jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyTyped
        if (pelanggan.getText().equals("") || buku.getText().equals("") || tharga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data");
        }
        else{
            if (jumlah.getText().toString().equals("")) {
                jumlah.setText("");
                total.setText("");
            }
            else{
                int stok = Integer.parseInt(String.valueOf(stok_tampung.getText()));
                int a    = Integer.parseInt(String.valueOf(jumlah.getText()));
                int b    = Integer.parseInt(String.valueOf(tharga.getText()));
                
                if (a > stok) {
                    JOptionPane.showMessageDialog(null, "Stok Hanya Tersedia " + stok);
                }
                else{
                    int jumlah = a * b;
                    total.setText(String.valueOf(jumlah));
                }
            }
        }
    }//GEN-LAST:event_jumlahKeyTyped

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
       int pilih = JOptionPane.showConfirmDialog(null,"Batal Beli ?","Confirmation",JOptionPane.YES_NO_OPTION);
       if(pilih == JOptionPane.NO_OPTION){
           
       }
       else
       {
           try {
               st = conn.createStatement();
               st.executeUpdate("DELETE FROM penjualan WHERE" + " kd_pretransaksi='"+ label1.getText() +"'");
               tampil_keranjang();
               tampild_buku();
               AutoKodePre();
               total_harga.setText("");
               bayar.setText("");
               angsulan.setText("");
               label1.setText("");
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }
    }//GEN-LAST:event_batalActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT SUM(sub_total) FROM penjualan WHERE " + " kd_transaksi='"+ transaksi.getText() +"'");
            while(rs.next()){
                total_harga.setText(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_selesaiActionPerformed

    private void tbl_keranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_keranjangMouseClicked
        label1.setText(tabmodel2.getValueAt(tbl_keranjang.getSelectedRow(), 0).toString());
        total_harga.setText(tabmodel2.getValueAt(tbl_keranjang.getSelectedRow(), 5).toString());
        selesai.setEnabled(true);
        batal.setEnabled(true);
        finish.setEnabled(true);
        label1.getText();
        
    }//GEN-LAST:event_tbl_keranjangMouseClicked

    public void t_report(){
        String reportSource = null;
        String reportDest = null;
    }
    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        if (total_harga.getText().equals("") || pembeli.getText().equals("") || bayar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Data Dahulu");
        }
        else
        {
            int total = Integer.parseInt(String.valueOf(total_harga.getText()));
            int bayarr = Integer.parseInt(String.valueOf(bayar.getText()));
            if (total > bayarr) {
                JOptionPane.showMessageDialog(null, "Maaf uang anda kurang");
            }
            else
            {
                int hasil = bayarr - total;
                angsulan.setText(String.valueOf(hasil));
                try {
                    st = conn.createStatement();
                    st.executeUpdate("INSERT INTO penjualan2 SET" + " kd_transaksi='"+ transaksi.getText() +"', nama_pelanggan='"+ pembeli.getText() +"', total='"+ total_harga.getText() +"'");
                    
                    JOptionPane.showMessageDialog(null,"Transaksi Selesai");
                    t_report();
                    AutoKodeTrans();
                    tampil_keranjang();
                    total_harga.setText("");
                    pembeli.setText("");
                    bayar.setText("");
                    angsulan.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_finishActionPerformed

    private void angsulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angsulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angsulanActionPerformed

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
            java.util.logging.Logger.getLogger(form_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_beli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angsulan;
    private javax.swing.JButton batal;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField buku;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jumlah;
    private javax.swing.JLabel kembali;
    private java.awt.Label label1;
    private javax.swing.JTextField pelanggan;
    private javax.swing.JTextField pembeli;
    private javax.swing.JTextField pretransaksi;
    private javax.swing.JButton selesai;
    private javax.swing.JLabel stok_tampung;
    private javax.swing.JButton tambah;
    private javax.swing.JTable tbl_buku;
    private javax.swing.JTable tbl_keranjang;
    private javax.swing.JTable tbl_pelanggan;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField total;
    private javax.swing.JTextField total_harga;
    private javax.swing.JTextField transaksi;
    // End of variables declaration//GEN-END:variables
}
