import java.util.Scanner;

public class ArrayRataNilai30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scan30.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0, nilaiLulus = 0, nilaiTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke - " + (i + 1) + " : ");
            nilaiMhs[i] = scan30.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus++;
                nilaiLulus += nilaiMhs[i];
            } else {
                totalTidakLulus++;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }

        System.out.println("Rata-rata nilai lulus = " + nilaiLulus / totalLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + nilaiTidakLulus / totalTidakLulus);
        scan30.close();
    }
}
