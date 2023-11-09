public class ContohVariabel30 {
    public static void main(String[] args) throws Exception {
        String hobi = "Bermain game";
        boolean isPintar = true;
        char gender = 'P';
        byte usia = 18;
        double ipk = 4.00, tinggiBadan = 1.54;

        System.out.println(hobi);
        System.out.println("Apakah pandai? " + isPintar);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umurku saat ini: " + usia);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggiBadan));
    }
}
