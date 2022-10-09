public class Penumpang {
    private String ktp;
    private String nama;

    

    public String info() {
        String info = "";
        info += "Ktp : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}
