import java.util.Scanner;

public class Weapon30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);
        int jarak;

        System.out.print("Masukkan jarak pertarungan (m): ");
        jarak = scan30.nextInt();

        if (jarak <= 5) {
            System.out.println("Gunakan Melee Weapon");
        } else if (jarak >= 1000) {
            System.out.println("Gunakan Ranged Weapon");
        }

        scan30.close();

    }
}
