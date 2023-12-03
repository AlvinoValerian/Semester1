import java.util.Scanner;

public class ucapan05 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama Orang Yang Ingin Kamu Beri Ucapan: ");
        String namaOrang=sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.print("Thank you "+ nama +"\nMay The Force Be With You");
    }
}
