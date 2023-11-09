import java.util.Scanner;

public class JajarGenjang30 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan tinggi jajar genjang: ");
        int tinggi = scan30.nextInt();

        // Loop untuk membuat setiap baris
        for (int i = 0; i < tinggi; i++) {

            // Loop untuk spasi di setiap baris
            for (int j = 0; j < tinggi - i - 1; j++) {
                System.out.print(" ");
            }

            // Loop untuk bintang di setiap baris
            for (int k = 0; k < tinggi; k++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya setelah satu baris selesai
        }

        scan30.close();
    }
}
