public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }

    public String info() {
        String info = "";
        info += "Nomor : " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang : " + penumpang.info() + "\n";
        }
        return info;
    }
}
