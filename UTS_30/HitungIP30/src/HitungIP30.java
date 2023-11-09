import java.util.Scanner;

public class HitungIP30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scan30.nextLine();

        String matkul, nilai, lanjut;
        int sks, total_sks = 0, jumlah_matkul = 0, remidi = 0;
        double bobot = 0, ip = 0, mutu = 0, total_mutu = 0;

        do {
            System.out.println("");
            System.out.print("Nama Mata Kuliah: ");
            matkul = scan30.nextLine();
            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            nilai = scan30.nextLine();
            System.out.print("Masukkan Jumlah SKS: ");
            sks = scan30.nextInt();
            scan30.nextLine();
            total_sks += sks;
            jumlah_matkul++;
            System.out.print("Apakah anda lanjut input nilai (Y/T)? ");
            lanjut = scan30.nextLine();

            if (nilai.equalsIgnoreCase("A")) {
                bobot = 4.0;
            } else if (nilai.equalsIgnoreCase("B+")) {
                bobot = 3.5;
            } else if (nilai.equalsIgnoreCase("B")) {
                bobot = 3.0;
            } else if (nilai.equalsIgnoreCase("C+")) {
                bobot = 2.5;
            } else if (nilai.equalsIgnoreCase("C")) {
                bobot = 2.0;
            } else if (nilai.equalsIgnoreCase("D")) {
                bobot = 1.0;
                remidi++;
            } else if (nilai.equalsIgnoreCase("E")) {
                bobot = 0.0;
                remidi++;
            } else {
                System.out.println("Inputan salah!");
            }

            mutu = sks * bobot;
            total_mutu += mutu;

        } while (lanjut.equalsIgnoreCase("Y"));

        ip = total_mutu / total_sks;

        System.out.println("");
        System.out.println("--------- Hasil Perhitungan IP ---------");
        System.out.println("Nama                 : " + nama);
        System.out.println("Indeks Prestasi (IP) : " + ip);
        System.out.println("Jumlah Mata Kuliah   : " + jumlah_matkul);
        System.out.println("Jumlah SKS           : " + total_sks);
        System.out.println("Jumlah MK remidi     : " + remidi);
        System.out.println("----------------------------------------");
    }
}
