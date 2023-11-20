import java.util.Scanner;

public class Percobaan630 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = scan30.nextInt();
        System.out.print("Masukkan lebar: ");
        l = scan30.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = scan30.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
        scan30.close();
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }

}
