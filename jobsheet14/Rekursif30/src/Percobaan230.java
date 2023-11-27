import java.util.Scanner;

public class Percobaan230 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung : ");
        bilangan = scan30.nextInt();
        System.out.print("Pangkat                : ");
        pangkat = scan30.nextInt();
        System.out.println("Hasil                  : " + hitungPangkat(bilangan, pangkat));

        scan30.close();
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
