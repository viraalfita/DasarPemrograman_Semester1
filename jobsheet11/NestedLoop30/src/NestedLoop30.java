import java.util.Scanner;

public class NestedLoop30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scan30.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double totalTemp = 0;
            for (double temp : temps[i]) {
                totalTemp += temp;
                System.out.println(temp + " ");
            }
            double rerataTemp = totalTemp / temps[i].length;
            System.out.println("\nRata-rata: " + rerataTemp + "\n");
        }

        scan30.close();
    }
}
