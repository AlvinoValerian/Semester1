import java.util.Scanner;

public class kantin {

    private static final String SECRET_PIN = "123456";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan PIN: ");
        String enteredPin = input.nextLine();

        if (!enteredPin.equals(SECRET_PIN)) {
            System.out.println("\nPIN salah. Akses ditolak.");
            System.exit(0);
        }

        String jenisPembayaran;
        float diskon, ppn;
        double total = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Selesai Belanja");
            int pilihan = input.nextInt();

            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Masukkan nama barang: ");
                String namaBarang = input.next();
                System.out.print("Masukkan harga barang: ");
                double harga = input.nextDouble();
                System.out.print("Masukkan Diskon (%): ");
                diskon = input.nextFloat() / 100;
                System.out.print("Masukkan PPN (%): ");
                ppn = input.nextFloat() / 100;

                double hargaDiskon = harga * diskon;
                double totalDiskon = harga - hargaDiskon;
                double totalPpn = totalDiskon * ppn;
                double totalItem = totalDiskon + totalPpn;
                total += totalItem;

                System.out.println("Total harga " + namaBarang + ": " + String.format("%.2f", totalItem));
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        

        System.out.println("Pilih Jenis Pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Cashless");
        int pilihPembayaran = input.nextInt();

        if (pilihPembayaran == 1) {
            jenisPembayaran = "Tunai";
        } else {
            System.out.println("Pilih Metode Pembayaran Cashless:");
            System.out.println("1. QRIS");
            System.out.println("2. Transfer Bank");
            int metodePembayaran = input.nextInt();
            if (metodePembayaran == 1) {
                jenisPembayaran = "QRIS";
            } else {
                jenisPembayaran = "Transfer Bank";
            }
        }
        System.out.println("Metode Pembayaran: " + jenisPembayaran);

        // You can add further processing for payment and change calculations here.
        System.out.println("\nTotal transaksi anda " + String.format("%.2f", total));

        input.close();
    }
}