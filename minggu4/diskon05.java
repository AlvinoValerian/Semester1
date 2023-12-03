import java.util.Scanner;

public class diskon05 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int harga,jumblah;
    double total,totalDisc,bayar,disc;

    System.out.println("Masukan Merk Buku");
    String namaa =input.next();
    
    System.out.println("Jumblah Halaman Buku");
    String kertass =input.next();

    System.out.println("Masukan Harga Barang");
    harga =input.nextInt();
    System.out.println("Masukkan Jumblah Barang");
    jumblah =input.nextInt();

    System.out.println("Masukkan Jumblah Discount");
    disc =input.nextDouble();

    total=harga*jumblah;
    totalDisc=(Double)total*disc;
    bayar=total-totalDisc;

    System.out.println("merk buku:"+namaa);
    System.out.println("jumblah kertas:"+kertass);
    System.out.println("bayar:"+bayar);

    input.close();

}    
}
