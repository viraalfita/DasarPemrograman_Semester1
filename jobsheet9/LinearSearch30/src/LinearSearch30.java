import java.util.Scanner;

public class LinearSearch30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Masukkan jumlah array : ");
        int jumlahArray = scan30.nextInt();

        int[] arrayInt = new int[jumlahArray];
        int key = 0;
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke - " + i + ": ");
            arrayInt[i] = scan30.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = scan30.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada di posisi indeks ke - " + hasil);
        }

        scan30.close();

    }
}
