import java.util.Scanner;

public class NilaiArray30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke - " + i + " : ");
            nilaiAkhir[i] = scan30.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke - " + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke - " + i + " tidak lulus!");
            }
        }

        scan30.close();
    }
}
