public class Tugas2 {
    public static void main(String[] args) {
        int f = 8;
        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }

    public static int penjumlahanRekursif(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

}
