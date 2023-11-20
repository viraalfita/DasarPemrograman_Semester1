import java.util.Scanner;

public class Ucapan30 {
    public static void main(String[] args) throws Exception {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }

    public static String PenerimaUcapan() {
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin anda berikan ucapan : ");
        String nama = scan30.nextLine();
        scan30.close();
        return nama;
    }
}
