public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masisnis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masisnis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masisnis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masisnis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setPegawai(Pegawai masinis) {
        this.masinis = masinis;
    }

    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis + "\n";
        info += "Asisten : " + this.asisten + "\n";
        return info;
    }
}
