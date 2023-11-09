import java.util.Scanner;

public class TugasGaji30 {
    public static void main(String[] args) {
        // Data pengguna (username, password, level)
        String[] usernames = { "user1", "user2", "admin" };
        String[] passwords = { "pass1", "pass2", "adminpass" };
        String[] levels = { "user", "user", "admin" };

        // Input dari pengguna
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scan30.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scan30.nextLine();

        // Cek login
        boolean loginBerhasil = false;
        String levelPengguna = "";

        for (int i = 0; i < usernames.length; i++) {
            if (inputUsername.equals(usernames[i]) && inputPassword.equals(passwords[i])) {
                loginBerhasil = true;
                levelPengguna = levels[i];

                if (loginBerhasil) {
                    System.out.println("Login berhasil!");

                    if ("admin".equals(levelPengguna)) {
                        System.out.println("Selamat datang admin!");
                        System.out.println();

                        System.out.println("--- Input Data Karyawan ---");
                        System.out.print("Nama: ");
                        String nama = scan30.nextLine();
                        System.out.print("Alamat: ");
                        String alamat = scan30.nextLine();
                        System.out.println();

                        System.out.println("--- Input Kategori Divisi ---");
                        System.out.println("1. Front Office");
                        System.out.println("2. House Keeping");
                        System.out.println("3. Food and Beverage Service");
                        System.out.println("4. Administrasi");
                        System.out.print("Masukkan kategori divisi : ");
                        int divisi = scan30.nextInt();
                        System.out.println();
                        System.out.println("--- Perhitungan Gaji Pokok ---");
                        System.out.print("Masukkan hari kerja: ");
                        int hariKerja = scan30.nextInt();
                        System.out.print("Masukkan jam lembur: ");
                        int jamLembur = scan30.nextInt();

                        int gajiPokok, gajiLembur, jmlGajiPokok, jmlGajiLembur, totalGaji;
                        switch (divisi) {
                            case 1:
                                gajiPokok = 80000;
                                gajiLembur = 12000;
                                jmlGajiPokok = gajiPokok * hariKerja;
                                jmlGajiLembur = gajiLembur * jamLembur;

                                totalGaji = jmlGajiPokok + jmlGajiLembur;
                                System.out.println();
                                System.out.println("Nama    : " + nama);
                                System.out.println("Alamat  : " + alamat);
                                System.out.println("Divisi  : Front Office");
                                System.out.println("Total gaji anda Rp " + totalGaji);
                                break;
                            case 2:
                                gajiPokok = 70000;
                                gajiLembur = 13000;
                                jmlGajiPokok = gajiPokok * hariKerja;
                                jmlGajiLembur = gajiLembur * jamLembur;

                                totalGaji = jmlGajiPokok + jmlGajiLembur;
                                System.out.println();
                                System.out.println("Nama    : " + nama);
                                System.out.println("Alamat  : " + alamat);
                                System.out.println("Divisi  : House Keeping");
                                System.out.println("Total gaji anda Rp " + totalGaji);
                                break;
                            case 3:
                                gajiPokok = 60000;
                                gajiLembur = 10000;
                                jmlGajiPokok = gajiPokok * hariKerja;
                                jmlGajiLembur = gajiLembur * jamLembur;

                                totalGaji = jmlGajiPokok + jmlGajiLembur;
                                System.out.println();
                                System.out.println("Nama    : " + nama);
                                System.out.println("Alamat  : " + alamat);
                                System.out.println("Divisi  : Food and Beverage Service");
                                System.out.println("Total gaji anda Rp " + totalGaji);
                                break;
                            case 4:
                                gajiPokok = 80000;
                                gajiLembur = 12000;
                                jmlGajiPokok = gajiPokok * hariKerja;
                                jmlGajiLembur = gajiLembur * jamLembur;

                                totalGaji = jmlGajiPokok + jmlGajiLembur;
                                System.out.println();
                                System.out.println("Nama    : " + nama);
                                System.out.println("Alamat  : " + alamat);
                                System.out.println("Divisi  : Administrasi");
                                System.out.println("Total gaji anda Rp " + totalGaji);
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("Selamat datang " + inputUsername);
                    }
                } else {
                    System.out.println("Login gagal. Username atau password salah.");
                }
                break;

            }
        }

    }
}
