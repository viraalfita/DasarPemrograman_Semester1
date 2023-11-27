public class Tugas1 {
    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println("Deret descending rekursif untuk n = " + n + " adalah ");
        deretDescendingRekursif(n);

        System.out.println("\n\nDeret descending iteratif untuk n = " + n + " adalah ");
        deretDescendingIteratif(n);
    }

    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }
}
