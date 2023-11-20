public class Percobaan530 {
    public static void main(String[] args) throws Exception {
        Tampil("Daspro 2023", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }

    static void Tampil(String str, int... a) {
        System.out.println("String: ");
        System.out.println("Jumlah argumen/parameter: ");

        for (int i : a) {
            System.out.println(i + " ");
        }

        System.out.println();
    }
}
