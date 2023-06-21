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

    //untuk mendapatkan nilai 'idAbsensi' dari objek 'absensi'
    public int getIdAbsensi() {
        return idAbsensi;
    }

    //untuk mendapatkan objek 'Siswa' terkait dengan absensi 
    public Siswa getSiswa() {
        return Siswa;
    }

    //untuk mendapatkan informasi tentang absensi siswa
    public String getKeterangan() {
        return keterangan;
    }

    //untuk mendapatkan tanggal absensi
    public String getTanggal() {
        return tanggal;
    }

    //untuk mendapatkan nama siswa
    public String getNamaSiswa(){
        return Siswa.getNama();
    }

    //untuk mendapatkan nama mata pelajaran
    public String getNamamatapelajaran(){
        return super.getNamamatapelajaran();
    }
}
