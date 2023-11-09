import java.util.Scanner;

public class PemilihanPercobaan230 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Nilai UAS : ");
        float uas = scan30.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = scan30.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = scan30.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = scan30.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.1F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total > 80 && total <= 100) {
            System.out.println("Nilai huruf = A");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai huruf = B+");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai huruf = B");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai huruf = C+");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai huruf = C");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai huruf = D");
        } else if (total <= 39) {
            System.out.println("Nilai huruf = E");
        }

        scan30.close();

    }
}
