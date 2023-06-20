package model;

abstract class matapelajaran {

    private String kodematapelajaran;
    private String namamatapelajaran;

    public matapelajaran(String kodematapelajaran, String namamatapelajaran) {
        this.kodematapelajaran = kodematapelajaran;
        this.namamatapelajaran = namamatapelajaran;
    }

    public String getKodematapelajaran() {
        return kodematapelajaran;
    }

    public String getNamamatapelajaran() {
        return namamatapelajaran;
    }
}


