import java.util.Scanner;

public class UcapanTerimaKasih30 {
    public static void main(String[] args) throws Exception {
        UcapanTerimaKasih();
        UcapanTambahan("May Allah bless you");
    }

    public static String PenerimaUcapan() {
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Tuliskan nama orang yang ingin anda berikan ucapan : ");
        String nama = scan30.nextLine();
        scan30.close();
        return nama;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama
                + "for being the best teacher in the world \nYou inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }
}
