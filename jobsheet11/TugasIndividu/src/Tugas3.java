import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan30.nextInt();

        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N tidak mencapai minimal!");
        }

        scan30.close();
    }
}
