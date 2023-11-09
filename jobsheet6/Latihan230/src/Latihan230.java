import java.util.Scanner;

public class Latihan230 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan hari beli   : ");
        String hariBeli = scan30.nextLine();

        if (hariBeli.equalsIgnoreCase("Rabu")) {
            System.out.print("Masukkan jenis buku  : ");
            String jenisBuku = scan30.nextLine();
            System.out.print("Masukkan jumlah beli : ");
            int jumlahBeli = scan30.nextInt();
            System.out.print("Masukkan harga buku  : Rp ");
            int hargaBuku = scan30.nextInt();

            if (jenisBuku.equalsIgnoreCase("Kamus")) {
                if (jumlahBeli > 2) {
                    double diskon = 0.12;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - totalDiskon;
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 12%");
                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                } else {
                    double diskon = 0.10;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - (diskon * hargaBuku);
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 10%");
                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                }
            } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                if (jumlahBeli > 3) {
                    double diskon = 0.09;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - (diskon * hargaBuku);
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 9%");

                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                } else if (jumlahBeli <= 3) {
                    double diskon = 0.08;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - (diskon * hargaBuku);
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 8%");

                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                } else {
                    double diskon = 0.07;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - (diskon * hargaBuku);
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 7%");

                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                }
            } else {
                if (jumlahBeli > 3) {
                    double diskon = 0.05;
                    double totalDiskon = diskon * hargaBuku;
                    double totalBayar = hargaBuku - (diskon * hargaBuku);
                    System.out.println();
                    System.out.println("Anda mendapatkan diskon sebesar 5%");

                    System.out.println("Total diskon yaitu Rp " + totalDiskon);
                    System.out.println("Total yang harus dibayar sebesar Rp " + totalBayar);
                } else {
                    System.out.println();
                    System.out.println("Anda tidak mendapatkan diskon");
                    System.out.println("Total yang harus dibayar sebesar Rp " + hargaBuku);
                }
            }
        } else {
            System.out.println("Maaf anda belum memenuhi syarat mendapatkan diskon");
        }
        scan30.close();
    }
}
