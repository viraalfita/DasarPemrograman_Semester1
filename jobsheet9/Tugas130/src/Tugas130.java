import java.util.Scanner;

public class Tugas130 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        // input banyaknya elemen
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scan30.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int temp;
        double jumlahNilai = 0;

        // input nilai tiap elemen
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Nilai mahasiswa ke - " + (i + 1) + " : ");
            nilaiMahasiswa[i] = scan30.nextInt();
            jumlahNilai += nilaiMahasiswa[i];
        }

        // untuk mengurutkan data dari terbesar ke terkecil
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 1; j < nilaiMahasiswa.length - 1; j++) {
                if (nilaiMahasiswa[j - 1] < nilaiMahasiswa[j]) {
                    temp = nilaiMahasiswa[j];

                    nilaiMahasiswa[j] = nilaiMahasiswa[j - 1];
                    nilaiMahasiswa[j - 1] = temp;
                }
            }
        }

        // mengambil nilai terbesar dan terkecil
        int terbesar = nilaiMahasiswa[0];
        int terkecil = nilaiMahasiswa[nilaiMahasiswa.length - 1];

        // mengoutputkan hasil
        System.out.println("Nilai terbesar : " + terbesar);
        System.out.println("Nilai terkecil : " + terkecil);
        System.out.println("Rata - rata    : " + jumlahNilai / jumlahMahasiswa);

    }
}
