public class tugas4 {
        static int hitungPasanganMarmut(int bulan) {
            if (bulan == 0 || bulan == 1) {
                return 1;
            } else {
                return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
            }
        }
    
        public static void main(String[] args) {
            int bulan = 12;
            int jumlahPasanganMarmut = hitungPasanganMarmut(bulan);
    
            System.out.println("Pada akhir bulan ke-" + bulan + ", ada " + jumlahPasanganMarmut + " pasangan marmut.");
        }
    }
    
