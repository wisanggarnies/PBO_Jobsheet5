public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getNama() {
        return this.nama;
    }

    public Mobil getMobil() {
        return this.mobil;
    }

    public Sopir getSopir() {
        return this.sopir;
    }

    public int getHari() {
        return this.hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + 
        sopir.hitungBiayaSopir(hari);
    }
}
