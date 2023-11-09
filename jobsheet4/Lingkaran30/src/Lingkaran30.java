import java.util.Scanner;

public class Lingkaran30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.print("Masukkan jari-jari lingkaran : ");
        r = sc.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("================================");
        System.out.println("Keliling lingkaran adalah " + keliling);
        System.out.println("Luas lingkaran adalah " + luas);

        sc.close();
    }
}
