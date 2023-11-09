/**
 * OperatorRelasi
 */
public class OperatorRelasi {

    public static void main(String[] args) {

        int x, y, z;
        x = 100;
        y = 99;
        z = 99;

        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);

        // operator sama dengan
        if (y == z) {
            System.out.println("y sama dengan z");
        } else {
            System.out.println("y tidak sama dengan z");
        }

        // operator tidak sama dengan
        if (x != y) {
            System.out.println("x tidak sama dengan y");
        } else {
            System.out.println("x sama dengan y");
        }

        // operator lebih besar dari
        if (x > y) {
            System.out.println("x lebih besar dari y");
        } else {
            System.out.println("x tidak lebih besar dari y");
        }

        // operator lebih besar dari
        if (x < y) {
            System.out.println("x lebih kecil dari y");
        } else {
            System.out.println("x tidak lebih kecil dari y");
        }

        // operator lebih besar atau sama dengan
        if (x >= y) {
            System.out.println("x lebih besar dari atau sama dengan y");
        } else {
            System.out.println("x tidak lebih besar dari atau sama dengan y");
        }

        // operator lebih kecil atau sama dengan
        if (x <= y) {
            System.out.println("x lebih kecil dari atau sama dengan y");
        } else {
            System.out.println("x tidak lebih kecil dari atau sama dengan y");
        }
    }
}