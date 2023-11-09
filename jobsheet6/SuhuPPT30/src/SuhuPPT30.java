import java.util.Scanner;

public class SuhuPPT30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);
        int suhu;
        char hujan;

        System.out.print("Masukkan suhu : ");
        suhu = scan30.nextInt();
        System.out.print("Apakah hujan? (y/t) : ");
        hujan = scan30.next().charAt(0);

        if (suhu > 27) {
            System.out.println("Memakai Dress");
            if (hujan == 'y' || hujan == 'Y') {
                System.out.println("Membawa Payung");

            } else {
                System.out.println("Memakai Sunscreen");
            }
        } else {
            System.out.println("Memakai Celana Panjang");
        }

        scan30.close();
    }
}
