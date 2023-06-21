package model;
//deklarasi class matapelajaran sebagai class abstract
abstract class matapelajaran {

    private String kodematapelajaran; // Variabel ini akan menyimpan kode mata pelajaran
    private String namamatapelajaran; // Variabel ini akan menyimpan nama mata pelajaran

    // Konstruktor untuk menginisialisasi nilai dari variabel instance
    public matapelajaran(String kodematapelajaran, String namamatapelajaran) {
        this.kodematapelajaran = kodematapelajaran;
        this.namamatapelajaran = namamatapelajaran;
    }
     // Mengembalikan nilai dari variabel "kodematapelajaran"
    public String getKodematapelajaran() {
        return kodematapelajaran;
    }
    // Untuk mengembalikan nilai dari variabel "namamatapelajaran"
    public String getNamamatapelajaran() {
        return namamatapelajaran;
    }
}


