public class tugas2 {
        static int penjumlahanRekursif(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + penjumlahanRekursif(n - 1);
            }
        }
    
        public static void main(String[] args) {
            int f = 8;
    
            System.out.println("Penjumlahan untuk f = " + f + " adalah: " + penjumlahanRekursif(f));
        }
    }
    
