package model;

public class Siswa {   // Mendeklarasi kelas publik bernama "Siswa"
    private int Absen;
    private String nama;

    // Konstruktor untuk menginisialisasi nilai dari variabel instance
    public Siswa(int Absen, String nama) {
        this.Absen = Absen;
        this.nama = nama;
    }

    // Method getter setter untuk mengakses nilai atribut
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
