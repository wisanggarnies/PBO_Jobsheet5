import java.util.Scanner;
public class RunPercobaan3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
        masinis, asisten);
        
        System.out.println(keretaApi.info());
    }
}
