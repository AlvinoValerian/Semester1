import java.util.Scanner;

public class BioskopWhithScanner05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Membuang karakter newline setelah memasukkan pilihan menu

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    
                    boolean kursiTersedia = false;
                    
                    while (!kursiTersedia) {
                        System.out.print("Masukkan Baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil diinput.");
                                kursiTersedia = true;
                            } else {
                                System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: ***\n", i + 1, j + 1);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
