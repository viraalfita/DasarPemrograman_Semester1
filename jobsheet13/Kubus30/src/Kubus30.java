import java.util.Scanner;

public class Kubus30 {

    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus : ");
        // s = sisi
        int s = scan30.nextInt();

        int volume = VolumeKubus(s);
        int luasPermukaan = LuasPermukaanKubus(s);

        System.out.println("Volume kubus                : " + volume);
        System.out.println("Luas permukaan kubus        : " + luasPermukaan);

        scan30.close();
    }

    // Fungsi untuk menghitung volume kubus
    public static int VolumeKubus(int s) {
        return s * s * s;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int LuasPermukaanKubus(int s) {
        return 6 * s * s;
    }
}