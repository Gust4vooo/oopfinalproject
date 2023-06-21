package view; //untuk mengorganisir kelas yang berhubungan dengan tampilan GUI

//kelas 'Menu' merupakan turunan dari kelas 'javax.swing.JFrame' dan akan menampilkan tampilan GUI
public class Menu extends javax.swing.JFrame {

    //konstruktor kelas 'Menu' akan memanggil metode 'initComponents()' untuk menginisialisasi komponen pada tampilan menu
    public Menu() {
        initComponents();
    }                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(); //panel kosong untuk menempatkan komponen GUI
        jLabel1 = new javax.swing.JLabel(); //menampilkan teks atau gambar pada GUI
        btnSiswa = new javax.swing.JButton(); //tombol yang dapat ditekan pada GUI
        btnAbsensi = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        //mengatur operasi yang akan dilakukan saat pengguna menutup jendela.
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //mengatur warna background dari panel jPanel1 menjadi warna RGB dengan kode warna (133, 163, 137).
        jPanel1.setBackground(new java.awt.Color(133, 163, 137));

        //mengatur teks (font, warna dan teks yang akan ditampilkan)
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-ABSEN");

        btnSiswa.setText("Siswa");
        //menambahkan action listener pada tombol btnSiswa yang akan menangani aksi ketika tombol ditekan
        btnSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiswaActionPerformed(evt);
            }
        });

        btnAbsensi.setText("Absensi");
        //Menambahkan action listener pada tombol btnAbsensi yang akan menangani aksi ketika tombol ditekan.
        btnAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsensiActionPerformed(evt);
            }
        });

        btnLogout.setText("Exit");
        //menambahkan action listener pada tombol btnLogout yang akan menangani aksi ketika tombol ditekan.
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        //membuat objek jPanel1Layout dari kelas javax.swing.GroupLayout yang akan digunakan untuk mengatur tata letak komponen di dalam jPanel1.
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbsensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(btnSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 163, 137));
        jLabel2.setText("Selamat Datang di ");

        jLabel4.setBackground(new java.awt.Color(133, 163, 137));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 163, 137));
        jLabel4.setText("APLIKASI ABSENSI ONLINE");

        //membuat objek jPanel2Layout dari kelas javax.swing.GroupLayout yang akan digunakan untuk mengatur tata letak komponen di dalam jPanel2.
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        //membuat objek layout dari kelas javax.swing.GroupLayout yang akan digunakan untuk mengatur layout komponen di dalam ContentPane
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        pack();
    }

    //metode event handler yang akan dipanggil ketika tombol btnSiswa ditekan.
    private void btnSiswaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        SiswaForm SiswaForm = new SiswaForm();
        SiswaForm.setVisible(true);
        this.dispose();
    }                                            
                                         
    //metode event handler yang akan dipanggil ketika tombol btnAbsensi ditekan.
    private void btnAbsensiActionPerformed(java.awt.event.ActionEvent evt) {                                   
        AbsensiForm absensiForm = new AbsensiForm();
        absensiForm.setVisible(true);
        this.dispose();
    }                                                                             

    //metode event handler yang akan dipanggil ketika tombol btnLogout ditekan.
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
    }     

    //deklarasi variabel yang merupakan objek tombol, objek label, dan objek panel.                     
    private javax.swing.JButton btnAbsensi;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
                      
}
