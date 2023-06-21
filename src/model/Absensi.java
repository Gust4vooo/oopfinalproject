package model;  //untuk mengorganisir kelas dan mengelompokkannya bersama
public class Absensi extends matapelajaran {    //deklarasi kelas absensi yang mewarisi sifat dan perilaku dari kelas matapelajaran
    //deklarasi variabel beserta tipe datanya
    private int idAbsensi;
    private Siswa Siswa;   
    private String keterangan;
    private String tanggal;

    //konstruktor kelas 'absensi'
    public Absensi(int idAbsensi, Siswa Siswa, String kodematapelajaran, String namamatapelajaran, String keterangan, String tanggal) {
        //pemanggilan konstruktor kelas induk
        super(kodematapelajaran, namamatapelajaran);
        this.idAbsensi = idAbsensi;
        this.Siswa = Siswa;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
    }

    //metode akses 'getIdAbsensi()' yang mengembalikan nilai 'idAbsensi'
    public int getIdAbsensi() {
        return idAbsensi;
    }

    //metode akses 'getSiswa()' yang mengembalikan objek 'Siswa'
    public Siswa getSiswa() {
        return Siswa;
    }

    //metode akses 'getKeterangan()' yang mengembalikan nilai 'keterangan' untuk mendapatkan informasi atau catatan tentang absensi siswa
    public String getKeterangan() {
        return keterangan;
    }

    //metode akses 'getTanggal()' yang mengembalikan nilai 'tanggal' untuk mendapatkan tanggal absensi
    public String getTanggal() {
        return tanggal;
    }

    //memanggil metode 'getNama()' dari objek 'Siswa' untuk mengambil nama siswa, dan mengembalikan nilainya
    public String getNamaSiswa(){
        return Siswa.getNama();
    }

    //menggunakan 'super' untuk mengakses metode 'getNamamatapelajaran' dari kelas induk.
    //menggunakan 'super.getNamamatapelajaran', nilai nama mata pelajaran yang diinisiasi konstruktor 'matapelajaran' akan dikembalikan
    public String getNamamatapelajaran(){
        return super.getNamamatapelajaran();
    }
}
