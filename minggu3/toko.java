import java.util.Scanner;

public class toko { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double totalHarga = 0.0;
    boolean lanjutBelanja = true;

    System.out.println("Selamat Datang di Kantin Sederhana");

    while (lanjutBelanja) {
        System.out.print("Masukkan Nama Item");
        String item = input.next();

        System.out.print("Masukan Harga Item");
        Double harga = input.nextDouble();

        totalHarga += harga;

        

        System.out.println("item" + item);
        System.out.println("harga"+ harga);

        System.out.println("Apakah Ingin Menambah Lagi (Ya/Tidak): ");
        String jawaban = input.next();

        if (jawaban.equalsIgnoreCase("tidak") ){
            lanjutBelanja = false;

        }

    }
    System.out.println("totalHarga" + totalHarga);
    System.out.println("Terima Kasih Telah Berbelanja Jangan lupa Beli Lagi ya :) ");

    input.close();


}
    
}
