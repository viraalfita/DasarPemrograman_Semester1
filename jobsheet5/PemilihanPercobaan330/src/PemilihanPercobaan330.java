import java.util.Scanner;

public class PemilihanPercobaan330 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = scan30.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = scan30.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = scan30.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;

            default:
                System.out.println("Operator yang anda masukkan tidak valid");
                break;
        }

        scan30.close();
    }
}
