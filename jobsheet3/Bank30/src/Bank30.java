import java.util.Scanner;

public class Bank30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, presentase_bunga = 0.02;

        System.out.println("Masukkan jumlah tabungan awal: ");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan berapa lama anda menabung: ");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

    }
}
