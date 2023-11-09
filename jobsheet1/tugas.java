import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama");
        String nama = scanner.nextLine();
        System.out.println("Masukkan nim");
        String nim = scanner.nextLine();

        System.out.println("Nama anda " + nama);
        System.out.println("NIM anda " + nim);

    }
}
