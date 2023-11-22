import java.util.Scanner;

public class NilaiMahasiswa30 {
    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static int hariTertinggi = 0;

    public static void main(String[] args) {
        inputJumlahMahasiswaTugas();
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];
        System.out.println();
        inputDataNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        System.out.println();
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        System.out.println();
        cariNilaiTertinggi();
        System.out.println();
        mahasiswaNilaiTertinggi();
    }

    static void inputJumlahMahasiswaTugas() {
        Scanner scan30 = new Scanner(System.in);
        System.out.print("Input jumlah mahasiswa: ");
        jumlahMahasiswa = scan30.nextInt();
        System.out.print("Input jumlah tugas: ");
        jumlahTugas = scan30.nextInt();
    }

    static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        Scanner scan30 = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println();
            System.out.print("Input nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scan30.nextLine();

            System.out.println();
            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scan30.nextInt();
            }
            scan30.nextLine();
        }
    }

    static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println(
                "+-----------------+------------+------------+------------+------------+------------+------------+");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < jumlahTugas; j++) {
            System.out.printf(" %-10s |", "Tugas " + (j + 1));
        }
        System.out.println(
                "\n+-----------------+------------+------------+------------+------------+------------+------------+");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.printf(" %-10d |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
        System.out.println(
                "+-----------------+------------+------------+------------+------------+------------+------------+");
    }

    public static void cariNilaiTertinggi() {
        double nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < jumlahTugas; j++) {
            double nilaiMinggu = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j;
            }
        }
    }

    public static void mahasiswaNilaiTertinggi() {
        cariNilaiTertinggi();
        System.out.println();
        System.out.println("Nilai tugas tertinggi pada tugas ke-" + (hariTertinggi + 1) + ":");
        double nilaiTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i][hariTertinggi] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariTertinggi];
                mahasiswaTertinggi = i;
            }
        }

        if (mahasiswaTertinggi != -1) {
            System.out.println("Nama Mahasiswa: " + namaMahasiswa[mahasiswaTertinggi]);
            System.out.println("Nilai pada tugas ke-" + (hariTertinggi + 1) + ": " +
                    nilaiMahasiswa[mahasiswaTertinggi][hariTertinggi]);
        } else {
            System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada tugas ke-" + (hariTertinggi + 1));
        }
    }
}