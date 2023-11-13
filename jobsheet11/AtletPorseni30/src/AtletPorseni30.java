import java.util.Scanner;

public class AtletPorseni30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };
        String[][] atlet = new String[4][5];

        int baris = atlet.length;
        int kolom = atlet[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.println("");
            System.out.println("Cabor " + cabor[i]);
            for (int j = 0; j < kolom; j++) {
                System.out.print("Atlet " + (j + 1) + "    : ");
                atlet[i][j] = scan30.nextLine();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom - 1; j++) {
                for (int k = 0; k < kolom - j - 1; k++) {
                    if (atlet[i][k].compareTo(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Data setelah diurutkan per cabor");
        for (int i = 0; i < cabor.length; i++) {
            System.out.println(cabor[i] + ": ");
            for (int j = 0; j < kolom; j++) {
                System.out.println(atlet[i][j] + " ");
            }
            System.out.println();
        }
    }
}
