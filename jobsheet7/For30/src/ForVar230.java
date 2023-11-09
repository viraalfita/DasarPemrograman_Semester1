import java.util.Scanner;

public class ForVar230 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        for (; !berhenti;) {
            System.out.print("Masukkan bilangan : ");
            bil = scan30.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");

        scan30.close();
    }
}
