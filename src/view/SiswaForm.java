package view;

import helper.DatabaseHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SiswaForm extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public SiswaForm() {
        initComponents();
        initTable();
        readData();

    }
    // Inisialisasi komponen GUI                
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtAbsen = new javax.swing.JTextField();
        edtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 163, 137));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAMBAH DATA SISWA");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Absen");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Lengkap");

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Absen", "Nama Siswa"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSiswa);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnKembali))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
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
    }// </editor-fold>                        

    // Menambah action pada tombol kembali
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }                                          
    
    // Menambah action pada tombol tambah
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String Absen = edtAbsen.getText();
        String nama = edtNama.getText();
        // Melakukan validasi
        if (validInput(Absen, nama)) {
            tambahSiswa((int) Long.parseLong(Absen), nama);
        } else {
            JOptionPane.showMessageDialog(this, "Input Tidak Valid");
        }
    }                                         
    // Method untuk mengatur action pada tombol hapus
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        hapusData();
    }                                                                              
    // Method untuk mengatur action saat mengklik baris pada tabel siswa
    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {                                            
        int selectedRow = tableSiswa.getSelectedRow();
        if (selectedRow != -1) {
            String Absen = tableSiswa.getValueAt(selectedRow, 0).toString();
            String nama = tableSiswa.getValueAt(selectedRow, 1).toString();

            edtAbsen.setText(Absen);
            edtNama.setText(nama);
        }
    }                                           
    // Method untuk menghapus data siswa
    private void hapusData() {
        int selectedRow = tableSiswa.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String Absen = tableSiswa.getValueAt(selectedRow, 0).toString();
        boolean success = hapusSiswa(Absen);

        if (success) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            readData();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data");
        }
    }

    // Method untuk menghapus data siswa dari tabel Siswa dalam database
    private boolean hapusSiswa(String Absen) {
        DatabaseHelper databaseHelper = new DatabaseHelper();
        String query = "DELETE FROM Siswa WHERE Absen = '" + Absen + "'";
        try {
            Statement statement = databaseHelper.getConnection().createStatement();
            int rowCount = statement.executeUpdate(query);
            statement.close();

            return rowCount > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }
    
    // Method untuk melakukan pengecekan input
    private boolean validInput(String Absen, String nama) {
        // Pengecekan Absen apakah merupakan angka
        if (!Absen.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Absen Harus berupa angka!");
            return false;
        }

        // Pengecekan nama apakah kosong atau tidak
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
            return false;
        }

        return true;
    }

    // Method untuk menginisialisasi tabel siswa
    private void initTable() {
        tableModel = new DefaultTableModel();
        tableSiswa.setModel(tableModel);
        tableModel.addColumn("Absen");
        tableModel.addColumn("Nama Siswa");
    }
    // Method untuk membaca data dari tabel Siswa dalam database dan menampilkan data tersebut ke dalam tabel pada antarmuka pengguna
    public void readData() {
        DatabaseHelper databaseHelper = new DatabaseHelper();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();

        try {
            tableModel.setRowCount(0);
            String query = "SELECT * FROM Siswa";

            Statement statement = databaseHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Object[] mhs = new Object[2];
                mhs[0] = resultSet.getString("Absen");
                mhs[1] = resultSet.getString("nama");

                tableModel.addRow(mhs);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private boolean tambahSiswa(int Absen, String nama) { 
        // Cek apakah Absen sudah ada dalam tabel
        String queryCheck = "SELECT COUNT(*) FROM Siswa WHERE Absen = ?";
        String queryInsert = "INSERT INTO Siswa (Absen, nama) VALUES (?,?)";
        try {
            DatabaseHelper databaseHelper = new DatabaseHelper();

            // Cek apakah Absen sudah ada?
            PreparedStatement checkStatement = databaseHelper.getConnection().prepareStatement(queryCheck);
            checkStatement.setLong(1, Absen);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            resultSet.close();
            checkStatement.close();

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Absen sudah terdaftar");
                return false;
            }

            // Menambahkan data Siswa
            PreparedStatement insertStatement = databaseHelper.getConnection().prepareStatement(queryInsert);
            insertStatement.setLong(1, Absen);
            insertStatement.setString(2, nama);
            int rowsAffected = insertStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data Siswa berhasil ditambahkan");
                Object[] mhs = new Object[2];
                mhs[0] = Absen;
                mhs[1] = nama;
                tableModel.addRow(mhs);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data Siswa");
            }
            insertStatement.close();
        } catch (SQLException e) {
            System.err.println("Failed to add Siswa: " + e.getMessage());
        }

        return false;
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField edtAbsen;
    private javax.swing.JTextField edtNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration                   
}
