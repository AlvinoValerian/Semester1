public class tugas3 {
    static boolean cekPrimaRekursif(int n, int i) {
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        int bilangan = 13;

        if (cekPrimaRekursif(bilangan, bilangan / 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
