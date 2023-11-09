import java.util.Scanner;

public class Toko30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        String nama;

        System.out.println("Program Toko");
        System.out.print("Masukkan Nama Anda: ");
        nama = scan30.nextLine();

        String produk, member, lanjut;
        double jumlah = 0, harga = 0, totalItem = 0, totalBeli = 0, subtotal = 0, subDiskon = 0, totalBayar = 0;
        double diskon = 0, totalDiskon = 0, diskonTambahan = 0;
        do {
            System.out.print("Masukkan produk yang anda beli: ");
            produk = scan30.nextLine();
            System.out.print("Banyaknya: ");
            jumlah = scan30.nextInt();
            System.out.print("Harga: ");
            harga = scan30.nextInt();
            System.out.print("Diskon: ");
            diskon = scan30.nextDouble();
            scan30.nextLine();
            totalItem++;
            totalBeli = jumlah * harga;
            totalDiskon = totalBeli * diskon;
            subtotal += totalBeli;
            subDiskon += totalDiskon;
            System.out.print("Apakah anda mau menambahkan produk (Y/T)? ");
            lanjut = scan30.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.print("Apakah anda mempunyai member (Y/T)? ");
        member = scan30.nextLine();

        if (member.equalsIgnoreCase("y")) {
            if (subtotal >= 200000) {
                diskonTambahan = subtotal * 0.10;
            } else {
                diskonTambahan = subtotal * 0.05;
            }
        } else {
            diskonTambahan = 0;
        }

        totalBayar = subtotal - subDiskon - diskonTambahan;

        System.out.println("----- Total Pembelian -----");
        System.out.println("Nama         : " + nama);
        System.out.println("Member       : " + member);
        System.out.println("Total item   : " + totalItem);
        System.out.println("Subtotal     : " + subtotal);
        System.out.println("Total diskon : " + subDiskon);
        System.out.println("Total bayar  : " + totalBayar);

    }
}
