
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class aplikasi extends javax.swing.JFrame {
Connection konek = koneksi.koneksiDb();

    public aplikasi() {
      initComponents();
        tampilDatauser();
        tampilDatabuku();
        tampilDatapeminjaman();
        
        dataUser();
        dataBuku();
        
        jTextField13.setEnabled(false);
         jTextField14.setEnabled(false);
    
    }
    
      private void dataUser() {
     try {
        Statement stat = konek.createStatement();
        ResultSet data = stat.executeQuery("SELECT UserID FROM usertbl");
        while (data.next())
        {
          jComboBox1.addItem(data.getString("UserID"));
        
        
        }
     } catch (Exception e) {
         
        System.err.println("Terjadi Kesalahan :" + e);
         
     
        
     
     }
        
     }
      
       private void dataBuku() {
     try {
        Statement stat = konek.createStatement();
        ResultSet data = stat.executeQuery("SELECT bukuID FROM bukutbl");
        while (data.next())
        {
          jComboBox2.addItem(data.getString("bukuID"));
        
        
        }
     } catch (Exception e) {
         
        System.err.println("Terjadi Kesalahan :" + e);
         
     
        
     
     }
        
     }
 private void tampilDatauser() {
      DefaultTableModel model = new DefaultTableModel();
            model.addColumn("UserID");
            model.addColumn("email"); 
            model.addColumn("nama lengkap");
            model.addColumn("alamat");
           
            
           jTable1.setModel(model);
            
            try {
                Statement stat = konek.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM usertbl");
                while (data.next()) {
                
                    model.addRow(new Object[]{
                     data.getString("UserID"),
                     data.getString("email"),
                     data.getString("nama_lengkap"),
                     data.getString("alamat")
                    
                    }); 
                    jTable1.setModel(model);
               }
            }
             catch (Exception e) {
           System.err.println("Terjadi Kesalahan :" + e);
        
        }
        
 }     
       private void tampilDatabuku() {    
         DefaultTableModel model = new DefaultTableModel();
            model.addColumn("bukuID");
            model.addColumn("judul"); 
            model.addColumn("penulis");
            model.addColumn("penerbit");
            model.addColumn("tahunterbit");
           
            
           jTable2.setModel(model);
            
            try {
                Statement stat = konek.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM bukutbl");
                while (data.next()) {
                
                    model.addRow(new Object[]{
                     data.getString("bukuID"),
                     data.getString("judul"),
                     data.getString("penulis"),
                     data.getString("penerbit"),
                     data.getInt("tahunterbit"),
                    
                    }); 
                    jTable2.setModel(model);
               }
            }
             catch (Exception e) {
           System.err.println("Terjadi Kesalahan :" + e);
        
        }
       }
       private void tampilDatapeminjaman() {   
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("peminjamanID");
            model.addColumn("userID"); 
            model.addColumn("bukuID");
            model.addColumn("tanggal peminjaman");
            model.addColumn("tanggal pengembalian");
            model.addColumn("status peminjaman");
           
            
           jTable3.setModel(model);
            
            try {
                Statement stat = konek.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM peminjamantbl");
                while (data.next()) {
                
                    model.addRow(new Object[]{
                     data.getString("peminjamanID"),
                     data.getString("userID"),
                     data.getString("bukuID"),
                     data.getString("tanggalpeminjaman"),
                     data.getString("tanggalpengembalian"),
                     data.getString("statuspeminjaman"),
                     
                     
                    
                    }); 
                    jTable3.setModel(model);
               }
            }
             catch (Exception e) {
           System.err.println("Terjadi Kesalahan :" + e);
        
             }
       }   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bukutbl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        peminjaman = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        user = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("aplikasi perpustakaan digital");

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jButton1.setText("usertbl");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("peminjamantbl");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("bukutbl");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("log out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jButton3)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setLayout(new java.awt.CardLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("bukuID");

        jLabel7.setText("judul");

        jLabel8.setText("penulis");

        jLabel9.setText("penerbit");

        jLabel10.setText("tahun terbit");

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));

        jButton9.setText("save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(127, 127, 127))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton9)
                .addGap(48, 48, 48)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addContainerGap())
        );

        jButton12.setBackground(new java.awt.Color(204, 153, 0));
        jButton12.setText("search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(204, 102, 0));
        jButton17.setText("refresh");

        javax.swing.GroupLayout bukutblLayout = new javax.swing.GroupLayout(bukutbl);
        bukutbl.setLayout(bukutblLayout);
        bukutblLayout.setHorizontalGroup(
            bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bukutblLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bukutblLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bukutblLayout.createSequentialGroup()
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bukutblLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bukutblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        bukutblLayout.setVerticalGroup(
            bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bukutblLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bukutblLayout.createSequentialGroup()
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bukutblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel4.add(bukutbl, "card3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));

        jLabel11.setText("peminjamanID");

        jLabel12.setText("userID");

        jLabel13.setText("bukuID");

        jLabel14.setText("tanggal peminjaman");

        jLabel15.setText("tanggal pengembalian ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel17.setText("status peminjaman");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 102));

        jButton13.setText("save");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("delete");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(26, 26, 26)
                .addComponent(jButton15))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(36, 36, 36))
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));

        jButton16.setText("search ");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setText("Refresh");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addContainerGap())
        );

        javax.swing.GroupLayout peminjamanLayout = new javax.swing.GroupLayout(peminjaman);
        peminjaman.setLayout(peminjamanLayout);
        peminjamanLayout.setHorizontalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(peminjamanLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        peminjamanLayout.setVerticalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(peminjamanLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(peminjaman, "card4");

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

        jLabel2.setText("userID");

        jLabel3.setText("email");

        jLabel4.setText("nama lengkap");

        jLabel5.setText("alamat");

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        jButton4.setText("save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(154, 154, 154))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(30, 30, 30)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jButton8.setBackground(new java.awt.Color(153, 51, 0));
        jButton8.setText("search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(userLayout.createSequentialGroup()
                                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(userLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(33, 33, 33)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(userLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(49, 49, 49)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(userLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(57, 57, 57)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(89, 89, 89))
                            .addGroup(userLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userLayout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addGap(58, 58, 58)))))
                .addGap(22, 22, 22))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5))
                            .addGroup(userLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(user, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user.setVisible(true);
        bukutbl.setVisible(false);
        peminjaman.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user.setVisible(false);
        bukutbl.setVisible(false);
        peminjaman.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        user.setVisible(false);
        bukutbl.setVisible(true);
        peminjaman.setVisible(false);      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        login celuk = new login(); 
        celuk.show();
        
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
     {
         Statement stat = konek.createStatement();
         
         ResultSet data = stat.executeQuery("SElECT * FROM usertbl WHERE UserID ='" + jTextField1.getText() + "'");
         if (data.next())
         {
             
             JOptionPane.showMessageDialog(null, "UserID sudah ada!!!", "PERHATIAN", JOptionPane.WARNING_MESSAGE );
             jTextField1.requestFocus();
             
         }
         else if(jTextField1.getText().equals("") || jTextField2.getText().equals("")
                 || jTextField3.getText().equals("")|| jTextArea1.getText(). equals(""))
         {
             
            JOptionPane.showMessageDialog(null, "Data Tidak boleh kosong!!", "PERHATIAN",JOptionPane.WARNING_MESSAGE);
         
         }
         else 
         {
             String sql = "INSERT INTO usertbl VALUES('" + jTextField1.getText() + "'"
             + ",'" + jTextField2.getText() +"'"
             + ",'" + jTextField3.getText() +"'" 
             + ",'" + jTextArea1.getText() +"')";
             
             stat.executeUpdate(sql);
             
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextArea1.setText("");
             jTextField1.requestFocus();
             
             JOptionPane.showMessageDialog(null, "Data berhasil di simpan!!", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
             tampilDatauser();
         }
         stat.close();
     }
    catch (Exception exc)
    {
        System.err.println("Terjadi kesalahan :" +exc);
    }
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
       if (ok==0)
       {
           try
           {
               String sql ="UPDATE usertbl SET email = '"+jTextField2.getText()
               +"', nama_lengkap = '"+jTextField3.getText()
               +"', alamat = '"+jTextArea1.getText()
               +"' WHERE UserID= '"+ jTextField1.getText().trim() +"'";
               
               Statement stat = konek.createStatement();
               stat.executeUpdate(sql);
               
               JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
               stat.close();
               
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jTextArea1.setText("");
               jTextField1.enable(true);
               jTextField1.requestFocus();
               tampilDatauser();
           }
           catch (Exception e)
           {
               JOptionPane.showMessageDialog(null, "Perubahan data gagal"+e.getMessage());
               
           }
       }       
                       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int baris =jTable1.getSelectedRow();
       if(baris != -1)
       {
           jTextField1.setText(jTable1.getValueAt(baris, 0).toString());
            jTextField2.setText(jTable1.getValueAt(baris, 1).toString());
            jTextField3.setText(jTable1.getValueAt(baris, 2).toString());
            jTextArea1.setText(jTable1.getValueAt(baris, 3).toString());
            
        
        
       jTextField1.enable(false);
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengahapus data ini", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION
     );
     if (ok == 0)
     {
         String sql = "DELETE FROM usertbl WHERE UserID = '" + jTextField1.getText().trim() + "'";
         try
         {
             Statement stat = konek.createStatement();
             stat.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data berhasil dihapus!!!", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
             stat.close();
             
             
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextArea1.setText("");
            
             jTextField1.enable(true);
             
             jTextField1.requestFocus();
             tampilDatauser();
         }
         catch (SQLException exc)
         {
           System.err.println(sql);
           System.err.println("Error :" + exc);
           
         }
     }                                       

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 String  a=jTextField5.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("userID");
        model.addColumn("email");
        model.addColumn("nama lengkpa");
        model.addColumn("Alamat");
        
        jTable1.setModel(model);
        
        try {
            Statement stat = konek.createStatement();
            ResultSet data = stat.executeQuery("SELECT * from usertbl WHERE UserID LIKE '%"
                    + a + "%' OR email LIKE '%" + a + "%' OR nama_lengkap  LIKE '%"
                    + a + "%' OR alamat LIKE '%" + a + "%'");
            while (data.next()) {
                
                model.addRow(new Object[]{
                    data.getString("UserID"),
                    data.getString("email"),
                    data.getString("nama_lengkap"),
                    data.getString("alamat")
                    
                });
                jTable1.setModel(model);
                
            }
            jTextField5.setText("");
        }
        catch (Exception e)
        {
            System.err.println("Terjadi Kesalahan :" + e);
        }
                    
                    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
     int baris =jTable2.getSelectedRow();
       if(baris != -1)
       {
           jTextField6.setText(jTable2.getValueAt(baris, 0).toString());
            jTextField7.setText(jTable2.getValueAt(baris, 1).toString());
            jTextField8.setText(jTable2.getValueAt(baris, 2).toString());
            jTextField9.setText(jTable2.getValueAt(baris, 3).toString());
            jTextField4.setText(jTable2.getValueAt(baris, 4).toString());
            
            
        
        
       jTextField6.enable(false);
       
    }                                    
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   try
     {
         Statement stat = konek.createStatement();
         
         ResultSet data = stat.executeQuery("SElECT * FROM bukutbl WHERE bukuID ='" + jTextField6.getText() + "'");
         if (data.next())
         {
             
             JOptionPane.showMessageDialog(null, "bukuID sudah ada!!!", "PERHATIAN", JOptionPane.WARNING_MESSAGE );
             jTextField6.requestFocus();
             
         }
         else if(jTextField6.getText().equals("") || jTextField7.getText().equals("")
                 || jTextField8.getText().equals("")|| jTextField9.getText(). equals("") ||  jTextField4.getText(). equals(""))
         {
             
            JOptionPane.showMessageDialog(null, "Data Tidak boleh kosong!!", "PERHATIAN",JOptionPane.WARNING_MESSAGE);
         
         }
         else 
         {
             String sql = "INSERT INTO bukutbl VALUES('" + jTextField6.getText() + "'"
             + ",'" + jTextField7.getText() +"'"
             + ",'" + jTextField8.getText() +"'" 
             + ",'" + jTextField9.getText() +"'"
             + ",'" + jTextField4.getText() +"')";
             stat.executeUpdate(sql);
             
             jTextField6.setText("");
             jTextField7.setText("");
             jTextField8.setText("");
             jTextField9.setText("");
             jTextField4.setText("");
             jTextField6.requestFocus();
             
             JOptionPane.showMessageDialog(null, "Data berhasil di simpan!!", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
             tampilDatabuku();
         }
         stat.close();
     }
    catch (Exception exc)
    {
        System.err.println("Terjadi kesalahan :" +exc);
    }
         
                                        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
       if (ok == 0)
       {
           try
           {
               String sql ="UPDATE bukutbl SET judul = '"+jTextField7.getText()
               +"', penulis = '"+jTextField8.getText()
               +"', penerbit = '"+jTextField9.getText()
               +"', tahunterbit = '"+jTextField4.getText()        
               +"' WHERE bukuID= '"+ jTextField6.getText().trim() +"'";
               
               Statement stat = konek.createStatement();
               stat.executeUpdate(sql);
               
               JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
               stat.close();
               
               jTextField6.setText("");
               jTextField7.setText("");
               jTextField8.setText("");
               jTextField9.setText("");
               jTextField6.enable(true);
               jTextField6.requestFocus();
               tampilDatabuku();
           }
           catch (Exception e)
           {
               JOptionPane.showMessageDialog(null, "Perubahan data gagal"+e.getMessage());
               
           }
       }         
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengahapus data ini", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION
     );
     if (ok == 0)
     {
         String sql = "DELETE FROM bukutbl WHERE bukuID = '" + jTextField6.getText().trim() + "'";
         try
         {
             Statement stat = konek.createStatement();
             stat.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data berhasil dihapus!!!", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
             stat.close();
             
             
             jTextField6.setText("");
             jTextField7.setText("");
             jTextField8.setText("");
             jTextField9.setText("");
             jTextField4.setText("");
             
             jTextField6.enable(true);
             
             jTextField6.requestFocus();
             tampilDatabuku();
         }
         catch (SQLException exc)
         {
           System.err.println(sql);
           System.err.println("Error :" + exc);
           
         }     
    }//GEN-LAST:event_jButton11ActionPerformed
    }
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String  a=jTextField10.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("bukuID");
        model.addColumn("judul");
        model.addColumn("penulis");
        model.addColumn("penerbit");
        model.addColumn("tahunterbit");
        
        jTable2.setModel(model);
        
        try {
            Statement stat = konek.createStatement();
            ResultSet data = stat.executeQuery("SELECT * from bukutbl WHERE bukuID LIKE '%"
                    + a + "%' OR judul LIKE '%" + a + "%' OR penulis LIKE '%"
                    + a + "%' OR penerbit LIKE '%" + a + "%' OR tahunterbit LIKE '%" + a + "%'");
            while (data.next()) {
                
                model.addRow(new Object[]{
                    data.getString("bukuID"),
                    data.getString("judul"),
                    data.getString("penulis"),
                    data.getString("penerbit"),
                    data.getString("tahunterbit")
                    
                });
                jTable2.setModel(model);
                
            }
            jTextField10.setText("");
        }
        catch (Exception e)
        {
            System.err.println("Terjadi Kesalahan :" + e);
        }
                            
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
     try
     {
         SimpleDateFormat fm = new SimpleDateFormat ("yyyy-MM-dd");
         int baris = jTable3.getSelectedRow();
         
         
         if (baris !=-1)
         {
         
         jTextField11.setText(jTable3.getValueAt(baris, 0).toString());
         jComboBox1.setSelectedItem(jTable3.getValueAt(baris, 1).toString());
         jComboBox2.setSelectedItem(jTable3.getValueAt(baris, 2).toString());
         jDateChooser2.setDate(fm.parse(jTable3.getValueAt(baris, 3).toString()));
         jDateChooser3.setDate(fm.parse(jTable3.getValueAt(baris, 4).toString()));
         jTextField15.setText(jTable3.getValueAt(baris, 5).toString());
         
         }
         
         jTextField11.setEnabled(false);
         
         
             
             
     }
     catch(Exception exc){
     
          System.err.println("Terjadi Kesalahan:" + exc);
     
     
     
     }
         
         
             
    
                               
    }//GEN-LAST:event_jTable3MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       try {
          Statement stat = konek.createStatement();
          ResultSet data = stat.executeQuery("SELECT nama_lengkap FROM usertbl WHERE "
          +"UserID ='" + jComboBox1.getSelectedItem()+ "'");
          if(data.next()) {
           jTextField13.setText(data.getString("nama_lengkap"));
          
          }
          else {
          
          jTextField13.setText("");
          }
       
       }
       catch (Exception e){
       
          System.err.println("Terjadi Kesalahan :"+ e);
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         try {
          Statement stat = konek.createStatement();
          ResultSet data = stat.executeQuery("SELECT judul FROM bukutbl WHERE "
          +"bukuID ='" + jComboBox2.getSelectedItem()+ "'");
          if(data.next()) {
           jTextField14.setText(data.getString("judul"));
          
          }
          else {
          
          jTextField14.setText("");
          }
       
       }
       catch (Exception e){
       
          System.err.println("Terjadi Kesalahan :"+ e);
       }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         String  a=jTextField12.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Peminjaman ID");
        model.addColumn("User ID");
        model.addColumn("Buku ID");
        model.addColumn("Tanggal Peminjaman");
        model.addColumn("Tanggal Kembali");
        
        jTable3.setModel(model);
        
        try {
            Statement stat = konek.createStatement();
            ResultSet data = stat.executeQuery("SELECT * from peminjamantbl WHERE PeminjamanID LIKE '%"
                    + a + "%' OR userID LIKE '%" + a + "%' OR bukuID  LIKE '%"
                    + a + "%' OR tanggalpeminjaman LIKE '%" + a + "%' OR tanggalpengembalian LIKE'%"+ a +"%' OR statuspeminjaman LIKE '%" + a + "%'");
            while (data.next()) {
                
                model.addRow(new Object[]{
                    data.getString("userID"),
                    data.getString("bukuID"),
                    data.getString("tanggalpeminjaman"),
                    data.getString("tanggalpengembalian"),
                    data.getString("statuspeminjaman")
                    
                });
                jTable3.setModel(model);
                
            }
            jTextField12.setText("");
        }
        catch (Exception e)
        {
            System.err.println("Terjadi Kesalahan :" + e);
        }
                    

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         tampilDatapeminjaman();
         jTextField12.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       try {
          Statement stat = konek.createStatement();
          ResultSet data = stat.executeQuery("SELECT * FROM peminjamantbl Where PeminjamanID ='" + jTextField11.getText() + "'");
          if (data.next())
          {
            JOptionPane.showMessageDialog(null, "Peminjaman ID Sudah Ada !!!! ", "PERHATIAN",JOptionPane.WARNING_MESSAGE);
            jTextField11.requestFocus();
            
          
          }
          else if (jTextField11.getText().equals("") || jComboBox1.getSelectedItem().equals("Pilih--")
                  || jComboBox2.getSelectedItem().equals("") || jDateChooser2.getDate()==null 
                  || jDateChooser3.getDate()==null
                  
                  ||  jTextField15.getText().equals(""))
          {
            
              JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong!!!","PERHATIAN",JOptionPane.WARNING_MESSAGE);
          
          
          }
          else if ((jDateChooser3.getDate().before(jDateChooser2.getDate()))==true)
          {
           JOptionPane.showMessageDialog(null,"Tanggal Kembali Harus Lebih Dari Atau Sama Dengan"
           +"tanggal pinjam !!!","PERHATIAN",JOptionPane.WARNING_MESSAGE);
          
          }
          else {
          
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tglpinjam=String.valueOf(fm.format(jDateChooser2.getDate()));
            String tglkembali=String.valueOf(fm.format(jDateChooser3.getDate()));
            
            
              String sql = "INSERT INTO peminjamantbl VALUES('" + jTextField11.getText()+ "'"
                    +",'" + jComboBox1.getSelectedItem()+"'"
                    + ",'" + jComboBox2.getSelectedItem() + "'"
                    +",'" + tglpinjam+"'"
                    +",'" + tglkembali+"'"
                    +",'" + jTextField15.getText() + "')";
               
            stat.executeUpdate(sql);
            jTextField11.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedItem(0);
            jDateChooser2.setDate(null);
            jDateChooser3.setDate(null);
            jTextField15.setText("");
            jTextField11.requestFocus();
            
            
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Simpan!!!","SUKSES",JOptionPane.INFORMATION_MESSAGE);
           tampilDatapeminjaman();
            
            
                    
            
         
          }
           stat.close();
          
          
        }
        
        catch (Exception exc){
        
          System.err.println("Terjadi Kesalahan :"+ exc);
        
        
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       if (jTextField11.getText().equals("") || jComboBox1.getSelectedItem().equals("Pilih--")
        || jComboBox2.getSelectedItem().equals("Pilih--") || jDateChooser2.getDate() == null || jDateChooser3.getDate() == null
        || jTextField15.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH DATA YANG MAU DI EDIT!!!", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
} else if (jDateChooser3.getDate().before(jDateChooser2.getDate())) {
    JOptionPane.showMessageDialog(null, "Tanggal Kembali Harus Lebih Dari Atau Sama Dengan Tanggal Pinjam!!", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
} else {
    int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Mengubah Data Ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
    if (ok == 0) {
        try {
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tglPinjam = String.valueOf(fm.format(jDateChooser2.getDate()));
            
            String tglKembali = String.valueOf(fm.format(jDateChooser3.getDate()));

            String sql = "UPDATE peminjamantbl SET peminjamanID = '" + jComboBox1.getSelectedItem()
                    + "',bukuid='" + jComboBox2.getSelectedItem()
                    + "',tanggalpeminjaman = '" + tglPinjam
                    + "',tanggalpengembalian = '" + tglKembali
                    + "', statuspeminjaman ='" + jTextField15.getText()
                    + "' WHERE peminjamanID ='" + jTextField11.getText().trim() + "'";

            Statement stat = konek.createStatement();
            stat.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah !!!", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
            stat.close();

            jTextField11.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jDateChooser2.setDate(null);
            jDateChooser3.setDate(null);
            jTextField15.setText("");
            jTextField11.setEnabled(true);
            jTextField11.requestFocus();

              tampilDatapeminjaman();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal: " + e.getMessage());
        }
    }
}
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       if (jTextField11.getText().equals("") || jComboBox1.getSelectedItem().equals("Pilih--")
        || jComboBox2.getSelectedItem().equals("Pilih--") || jDateChooser2.getDate() == null || jDateChooser3.getDate() == null
        || jTextField15.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "SILAHKAN PILIH DATA YANG MAU DI Hapus!!!", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
} else {
    int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
    if (ok == 0) {
        String sql = "DELETE FROM peminjamantbl WHERE peminjamanID='" + jTextField1.getText().trim() + "'";
        try {
            Statement stat = konek.createStatement();
            stat.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus !!!", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
            stat.close();

            jTextField11.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jDateChooser2.setDate(null);
            jDateChooser3.setDate(null);
            jTextField15.setText("");

            jTextField11.setEnabled(true); // Menggunakan setEnabled daripada enable
            jTextField11.requestFocus();

            tampilDatapeminjaman();

        } catch (SQLException exc) {
            System.err.println(sql);
            System.err.println("Error:" + exc);
        }
    }
}
    }//GEN-LAST:event_jButton15ActionPerformed
    
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
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bukutbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel peminjaman;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables

    

}