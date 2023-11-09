import java.util.Scanner;

public class WhileGaji30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        int jumlahKaryawan, jumlahjamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan30.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan30.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahjamLembur = scan30.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gajiLembur = jumlahjamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahjamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                i = i - 1; // untuk bisa masuk kembali pada percabangan
                gajiLembur = 0; // set gaji lembur ke 0
            }

            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);

        scan30.close();
    }
}
