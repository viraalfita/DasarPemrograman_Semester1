import java.util.Scanner;

public class IfKondisi30 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan suhu : ");
        int suhu = scan.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu < 20) {
            System.out.println("Silahkan pakai baju tebal");
        } else {
            System.out.println("Silahkan pakai topi");
        }

        scan.close();
    }
}
