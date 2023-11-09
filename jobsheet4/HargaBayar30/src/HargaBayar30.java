import java.util.Scanner;

public class HargaBayar30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalamanBuku;
        String merkBuku;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukkan merk buku yang dibeli: ");
        merkBuku = input.nextLine();

        System.out.print("Masukkan jumlah halaman buku yang dibeli: ");
        jmlHalamanBuku = input.nextInt();

        System.out.print("Masukkan harga barang yang dibeli: Rp ");
        harga = input.nextInt();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();

        System.out.print("Masukkan total diskon: ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("===============================================");
        System.out.println("Diskon yang anda dapatkan adalah: Rp " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: Rp " + bayar);

        input.close();
    }
}
