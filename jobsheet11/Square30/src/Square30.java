import java.util.Scanner;

public class Square30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan30.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan30.close();

    }
}
