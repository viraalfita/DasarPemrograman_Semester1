import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan30.nextInt();

        if (n >= 5) {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N tidak mencapai minimal!");
        }

        scan30.close();
    }
}
