import java.util.Scanner;

public class SistemGajiKelompok30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan data karyawan
        String nama = "";
        String alamat = "";
        String divisi = "";

        System.out.print("Masukkan jumlah data: ");
        int jumlahKaryawan = sc.nextInt();

        // Perulangan for untuk input data karyawan
        for (int i = 1; i <= jumlahKaryawan; i++) {
            System.out.println("-----------------------------");
            System.out.println("Data Karyawan ke-" + (i));
            System.out.println("-----------------------------");
            System.out.print("Nama: ");
            nama = sc1.nextLine();
            System.out.print("Alamat: ");
            alamat = sc2.nextLine();
            System.out.println("------- Divisi -------");
            System.out.println("1. Front Office");
            System.out.println("2. House Keeping");
            System.out.println("3. Food and Beverage Service");
            System.out.println("4. Administrasi");
            System.out.print("Masukkan kategori divisi anda : ");
            divisi = sc3.nextLine();
            System.out.println("----------------------");
        }

        // Menampilkan data slip gaji karyawan karyawan
        for (int i = 1; i <= jumlahKaryawan; i++) {
            System.out.println();
            System.out.println("Karyawan ke-" + (i));
            System.out.println();
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Divisi: " + divisi);

            System.out.println("Gaji Pokok   : Rp 3.500.000");
            System.out.println("Gaji Lembur  : Rp 200.000");
            System.out.println("Total Gaji   : Rp 3.700.000");

        }

    }
}