import java.util.Scanner;

public class Percobaan330 {
    public static void main(String[] args) {
        Scanner scan30 = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = scan30.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = scan30.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));

        scan30.close();
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
