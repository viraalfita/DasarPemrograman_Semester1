import java.util.Scanner;

public class Login30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        String username, inputUsername, password, inputPassword;

        username = "vira";
        password = "vira123";

        System.out.print("Masukkan username : ");
        inputUsername = scan30.nextLine();
        System.out.print("Masukkan password : ");
        inputPassword = scan30.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Selamat Datang");
        } else {
            System.out.println("Username dan Password Salah");
        }

        scan30.close();
    }
}
