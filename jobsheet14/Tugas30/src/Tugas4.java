public class Tugas4 {
    public static void main(String[] args) {
        int months = 12;
        System.out.println("Total pasangan marmut pada akhir bulan ke-" + months + " adalah: " + fibonacci(months));
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
