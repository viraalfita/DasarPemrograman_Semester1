import java.util.Scanner;

public class Pemilihan2Percobaan230 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut 1 : ");
        sudut1 = scan30.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = scan30.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = scan30.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }

        scan30.close();
    }
}
