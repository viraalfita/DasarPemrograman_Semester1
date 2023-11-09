import java.util.Scanner;

public class Triangle30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = scan30.nextInt();
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

        scan30.close();
    }
}
