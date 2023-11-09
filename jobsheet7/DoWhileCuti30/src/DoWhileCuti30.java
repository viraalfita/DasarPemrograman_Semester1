import java.util.Scanner;

public class DoWhileCuti30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan30.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan30.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan30.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.print("Sisa jatah cuti: " + jatahCuti + "\n");
                } else {
                    System.out.println("Jumlah hari cuti yang diminta melebihi jatah cuti yang tersisa.");
                    while (true) {
                        System.out.print("Masukkan jumlah hari yang sesuai dengan jatah cuti yang tersisa: ");
                        int inputHari = scan30.nextInt();
                        if (inputHari <= jatahCuti) {
                            jatahCuti -= inputHari;
                            System.out.print("Sisa jatah cuti: " + jatahCuti + "\n");
                            break;
                        } else {
                            System.out.println("Jumlah hari cuti yang diminta masih melebihi jatah cuti yang tersisa.");
                        }
                    }
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Inputan tidak valid");
            }
        } while (jatahCuti > 0);

        scan30.close();
    }
}
