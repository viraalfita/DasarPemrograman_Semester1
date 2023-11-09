import java.util.Scanner;

public class TugasMandiri130 {

    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        // Deklarasi variabel
        String nama;
        String jenisKelamin;

        int jumlahMahasiswa = 30;

        // Perulangan for untuk membaca data mahasiswa
        for (int i = 1; i < jumlahMahasiswa; i++) {
            // Membaca data mahasiswa
            System.out.print("Masukkan nama mahasiswa ke-" + (i) + ": ");
            nama = scan30.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa ke-" + (i) + ": ");
            jenisKelamin = scan30.nextLine();

            // Menampilkan nama mahasiswa perempuan
            if (jenisKelamin.equalsIgnoreCase("P")) {
                System.out.println("Nama mahasiswa perempuan: " + nama);
            }
        }
    }
}