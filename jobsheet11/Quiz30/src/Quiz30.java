import java.util.Random;
import java.util.Scanner;

public class Quiz30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);
        Random random30 = new Random();

        char menu = 'y';
        do {
            int number = random30.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = scan30.nextInt();
                scan30.nextLine();
                if (answer < number) {
                    System.out.println("Tebakan terlalu kecil");
                } else if (answer > number) {
                    System.out.println("Tebakan terlalu besar");
                } else {
                    System.out.println("Tebakan benar!");
                }
                success = (answer == number);
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y?)");
            menu = scan30.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        scan30.close();
    }
}
