import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan30.nextInt();

        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N tidak mencapai minimal!");
        }

        scan30.close();
    }
}
