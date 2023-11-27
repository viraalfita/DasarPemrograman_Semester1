public class Tugas3 {
    public static void main(String[] args) {
        int bilangan = 17;

        if (cekPrimaRekursif(bilangan, 2)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }

    static boolean cekPrimaRekursif(int n, int pembagi) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % pembagi == 0) {
            return false;
        }
        if (pembagi * pembagi > n) {
            return true;
        }
        return cekPrimaRekursif(n, pembagi + 1);
    }

}
