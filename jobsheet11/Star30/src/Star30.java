import java.util.Scanner;

public class Star30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan30.nextInt();

        for (int i = 1; i <= n; i--) {
            System.out.print("*");
        }

        scan30.close();
    }
}
