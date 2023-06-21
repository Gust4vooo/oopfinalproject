package view;

import model.Absensi;
import model.Siswa;
import helper.DatabaseHelper;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AbsensiForm extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    // Inisialisasi form AbsensiForm
    public AbsensiForm() {
        initComponents();
        cmbKeterangan.addItem("Hadir");
        cmbKeterangan.addItem("Izin");
        cmbKeterangan.addItem("Alpha");
        edtIDAbsensi.setEnabled(false);
        edtIDAbsensi.setBackground(Color.LIGHT_GRAY);
        edtIDAbsensi.setDisabledTextColor(Color.black);
        initTable();
        readData();
    }
    // Menginisialisasi model tabel dan menambahkan kolom-kolomnya
    private void initTable() {
        tableModel = new DefaultTableModel();
        tableAbsensi.setModel(tableModel);
        tableModel.addColumn("ID Absensi");
        tableModel.addColumn("Absen");
        tableModel.addColumn("Nama Mapel");
        tableModel.addColumn("Keterangan");
        tableModel.addColumn("Tanggal");
    }
    // Membaca data dari database dan menampilkan dalam tabel
    public void readData() {
        DatabaseHelper databaseHelper = new DatabaseHelper();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();

        try {
            tableModel.setRowCount(0);
            String query = "SELECT * FROM absensi";

            Statement statement = databaseHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Object[] absensi = new Object[5];
                absensi[0] = resultSet.getString("id_absensi");
                absensi[1] = resultSet.getString("Absen");
                absensi[2] = resultSet.getString("kode_mapel");
                absensi[3] = resultSet.getString("keterangan");
                absensi[4] = resultSet.getString("tanggal");

                tableModel.addRow(absensi);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // Inisialisasi komponen GUI 
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtAbsen = new javax.swing.JTextField();
        edtIDAbsensi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtKodemapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbKeterangan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        edtDate = new com.toedter.calendar.JDateChooser();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAbsensi = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 163, 137));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISI DATA ABSENSI");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Absensi");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nomor Absen");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Mapel");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Keterangan");

        cmbKeterangan.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cmbKeterangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tableAbsensi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAbsensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAbsensiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAbsensi);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(50, 50, 50)
                                    .addComponent(edtIDAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(71, 71, 71)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(edtKodemapel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtAbsen)
                                    .addComponent(cmbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtIDAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtKodemapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(edtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnKembali))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
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
    }                     

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String absenText = edtAbsen.getText().toString(); // Mengambil nilai dari EditText dan mengubahnya menjadi String
        int Absen = Integer.parseInt(absenText);
        String kode = edtKodemapel.getText();
        String keterangan = cmbKeterangan.getSelectedItem().toString();
        Date tanggal = edtDate.getDate();

        if (validInput(Absen, kode, keterangan)) {
            tambahAbsensi(Absen, kode, keterangan, tanggal);
            readData();
        } else {
            JOptionPane.showMessageDialog(this, "Input Tidak Valid");
        }
    }                                         

    private boolean tambahAbsensi(int Absen, String kode, String keterangan, Date tanggal) {
        String query = "INSERT INTO absensi (Absen, kode_mapel, keterangan, tanggal) VALUES (?,?,?,?)";
        String querySelect = "SELECT * FROM Siswa WHERE Absen = ?";
        String querymapel = "SELECT * FROM matapelajaran WHERE kode_mapel = ?";
        try {
            DatabaseHelper databaseHelper = new DatabaseHelper();

            // select nama Siswa
            PreparedStatement selectStatement = databaseHelper.getConnection().prepareStatement(querySelect);
            selectStatement.setInt(1, Absen);
            ResultSet resultSet = selectStatement.executeQuery();
            
            String nama = null;
            if (resultSet.next()) {
                nama = resultSet.getString("nama");
            }

            // select nama mapel
            PreparedStatement selectmapel = databaseHelper.getConnection().prepareStatement(querymapel);
            selectmapel.setString(1, kode);
            ResultSet resultmapel = selectmapel.executeQuery();

            String namamapel = null;
            if (resultmapel.next()){
                namamapel = resultmapel.getString("nama_mapel");
            }


            PreparedStatement statement = databaseHelper.getConnection().prepareStatement(query);
            statement.setInt(1, Absen);
            statement.setString(2, kode);
            statement.setString(3, keterangan);
            statement.setDate(4, new java.sql.Date(tanggal.getTime()));

            String tanggalString = new java.sql.Date(tanggal.getTime()).toString();

            // membuat objek Siswa
            Siswa mhs = new Siswa(Absen, nama);

            // membuat objek absensi
            Absensi absen = new Absensi(getLastInsertedID(), mhs, kode, namamapel, keterangan, tanggalString);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data Absensi " + absen.getNamaSiswa() + " pada mata pelajaran "+ absen.getNamamatapelajaran() +" berhasil ditambahkan");
                Object[] absensi = new Object[5];
                absensi[0] = getLastInsertedID(); // Mengambil ID Absensi terakhir setelah data ditambahkan
                absensi[1] = Absen;
                absensi[2] = kode;
                absensi[3] = keterangan;
                absensi[4] = tanggal;
                tableModel.addRow(absensi);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data Absensi" + absen.getNamaSiswa());
            }
            statement.close();

        } catch (SQLException e) {
            System.err.println("Failed to validate mapel: " + e.getMessage());
        }

        return false;
    }
    // Method untuk mengatur id absensi
    private int getLastInsertedID() {
        String query = "SELECT id_absensi FROM absensi ORDER BY id_absensi DESC LIMIT 1";

        try {
            DatabaseHelper databaseHelper = new DatabaseHelper();
            Statement statement = databaseHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return resultSet.getInt("id_absensi");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    // Method untuk mengecek data
    private boolean validInput(int absen, String kode, String keterangan) {
        if (kode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode mata pelajaran tidak boleh kosong!");
            return false;
        }
        if (absen == 0) {
            JOptionPane.showMessageDialog(this, "Absen tidak boleh kosong!");
            return false;
        }
        if (keterangan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Keterangan tidak boleh kosong!");
            return false;
        }

        return true;
    }
    // Method memberikan action kepada tombol hapus
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Mendapatkan baris yang dipilih dari tabel
        int selectedRow = tableAbsensi.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        String id = tableAbsensi.getValueAt(selectedRow, 0).toString();
        boolean success = hapusAbsensi(id);

        if (success) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            readData();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data");
        }
    }                                        
    // Fungsi untuk menghapus data absensi berdasarkan I
    private boolean hapusAbsensi(String id) {
        DatabaseHelper databaseHelper = new DatabaseHelper();
        String query = "DELETE FROM absensi WHERE id_absensi = '" + id + "'";
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
    // Memberikan action untuk kembali ke menu utama
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }                                          

    private void tableAbsensiMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // Mendapatkan baris yang dipilih dari tabel
        int selectedRow = tableAbsensi.getSelectedRow();
        if (selectedRow != -1) {
            String id = tableAbsensi.getValueAt(selectedRow, 0).toString();
            String Absen = tableAbsensi.getValueAt(selectedRow, 1).toString();
            String kode = tableAbsensi.getValueAt(selectedRow, 2).toString();
            String keterangan = tableAbsensi.getValueAt(selectedRow, 3).toString();
            String tanggal = tableAbsensi.getValueAt(selectedRow, 4).toString();

            edtIDAbsensi.setText(id);
            edtAbsen.setText(Absen);
            edtKodemapel.setText(kode);
            cmbKeterangan.setSelectedItem(keterangan);
            try {
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date tanggalDate = dateFormat.parse(tanggal);
                edtDate.setDate(tanggalDate);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

        }

    }                                         

    // Variables declaration - do not modify       
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKeterangan;
    private com.toedter.calendar.JDateChooser edtDate;
    private javax.swing.JTextField edtIDAbsensi;
    private javax.swing.JTextField edtKodemapel;
    private javax.swing.JTextField edtAbsen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAbsensi;
    // End of variables declaration                   
}
