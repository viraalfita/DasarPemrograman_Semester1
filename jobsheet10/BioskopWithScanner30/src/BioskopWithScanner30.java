import java.util.Scanner;

public class BioskopWithScanner30 {
    public static void main(String[] args) throws Exception {
        Scanner scan30 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("--------- Menu -----------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan menu yang dipilih : ");
            int pilih = scan30.nextInt();
            scan30.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    while (true) {
                        System.out.println("------ Input Data Penonton ------");
                        System.out.print("Masukkan nama: ");
                        nama = scan30.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = scan30.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = scan30.nextInt();
                        scan30.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data berhasil disimpan");
                            } else {
                                System.out.println("Maaf, kursi sudah terisi oleh penonton lain.");
                                System.out.print("Masukkan baris: ");
                                baris = scan30.nextInt();
                                System.out.print("Masukkan kolom: ");
                                kolom = scan30.nextInt();
                                scan30.nextLine();

                                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    System.out.println("Data berhasil disimpan");
                                } else {
                                    System.out.println("Kursi tidak tersedia. Data tidak disimpan.");
                                }
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia. Coba lagi.");
                        }

                        System.out.println();
                        System.out.print("Apakah anda akan menginput data lagi? (y/t) : ");
                        next = scan30.nextLine();

                        if (next.equalsIgnoreCase("t")) {
                            break;
                        }
                    }

                case 2:
                    System.out.println("----- Daftar Penonton ------");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                            if (penonton[i][j] != null) {
                                System.out.println(penonton[i][j]);
                            } else {
                                System.out.println("***");
                            }
                        }
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Input yang dimasukkan tidak valid!");
                    break;
            }

            if (pilih == 3) {
                System.out.println("Anda berhasil exit");
                break;
            }

        }

        scan30.close();
    }
}
