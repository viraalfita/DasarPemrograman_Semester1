import java.util.Scanner;

public class Gaji30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        System.out.print("Masukkan jumlah hari masuk kerja anda : ");
        jmlMasuk = sc.nextInt();

        System.out.print("Masukkan nominal gaji pokok anda : ");
        gaji = sc.nextInt();

        System.out.print("Masukkan jumlah hari tidak masuk kerja anda : ");
        jmlTdkMasuk = sc.nextInt();

        System.out.print("Masukkan nominal potongan gaji tidak masuk kerja anda : ");
        potGaji = sc.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        System.out.println("=============================");
        System.out.println("Gaji yang anda terima adalah " + totGaji);

        sc.close();
    }
}
