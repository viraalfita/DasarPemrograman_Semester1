import java.util.Scanner;

public class Latihan130 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = scan30.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int bil2 = scan30.nextInt();
        System.out.print("Masukkan bilangan ketiga  : ");
        int bil3 = scan30.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar : " + bil1);
            } else {
                System.out.println("Bilangan terbesar : " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar : " + bil2);
            } else {
                System.out.println("Bilangan terbesar : " + bil3);
            }
        }

        scan30.close();
    }
}
