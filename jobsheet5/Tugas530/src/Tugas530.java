import java.util.Scanner;

public class Tugas530 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String usernameAdmin = "admin";
        String passwordAdmin = "admin";

        System.out.println("Silahkan login terlebih dahulu");
        System.out.println("==============================");
        System.out.print("Masukkan username : ");
        String inputUsername = scan.nextLine();
        System.out.print("Masukkan password : ");
        String inputPassword = scan.nextLine();

        if (inputUsername.equals(usernameAdmin) && inputPassword.equals(passwordAdmin)) {
            System.out.println("Selamat Datang di GajiPintar");
            System.out.println("------- Divisi -------");
            System.out.println("1. Front Office");
            System.out.println("2. House Keeping");
            System.out.println("3. Food and Beverage Service");
            System.out.println("4. Administrasi");
            System.out.print("Masukkan kategori divisi anda : ");

            int divisi = scan.nextInt();

            switch (divisi) {
                case 1:
                    System.out.println("Gaji pokok anda Rp. 50000/Hari");
                    break;
                case 2:
                    System.out.println("Gaji pokok anda Rp. 70000/Hari");
                    break;
                case 3:
                    System.out.println("Gaji pokok anda Rp. 40000/Hari");
                    break;
                case 4:
                    System.out.println("Gaji pokok anda Rp. 60000/Hari");
                    break;

                default:
                    System.out.println("Input yang anda masukkan salah!");
                    break;
            }
        } else {
            System.out.println("Username atau password anda salah!");
        }
        scan.close();

    }
}