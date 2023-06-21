package model;
public class Siswa {
    private int Absen;
    private String nama;

    public Siswa(int Absen, String nama) {
        this.Absen = Absen;
        this.nama = nama;
    }

    public int getAbsen() {
        return Absen;
    }

    public String getNama() {
        return nama;
    }

    public void setAbsen(int Absen) {
        this.Absen = Absen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
