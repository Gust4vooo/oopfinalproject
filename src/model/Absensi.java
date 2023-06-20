package model;
public class Absensi extends matapelajaran {
    private int idAbsensi;
    private Siswa Siswa;
    private String keterangan;
    private String tanggal;

    public Absensi(int idAbsensi, Siswa Siswa, String kodematapelajaran, String namamatapelajaran, String keterangan, String tanggal) {
        super(kodematapelajaran, namamatapelajaran);
        this.idAbsensi = idAbsensi;
        this.Siswa = Siswa;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
    }

    public int getIdAbsensi() {
        return idAbsensi;
    }

    public Siswa getSiswa() {
        return Siswa;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getNamaSiswa(){
        return Siswa.getNama();
    }

    public String getNamamatapelajaran(){
        return super.getNamamatapelajaran();
    }
}
