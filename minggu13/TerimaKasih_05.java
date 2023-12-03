import java.util.Scanner;

public class TerimaKasih_05 {
    public static String PenerimaUcapan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang Yang Ingin Kamu Beri Ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank " + nama + " you for being the best teacher in the world.\n"+
         "you inspired in me a love for learning and made me feel like i could ask you anything.");
     }
      public static void ucapanTambahan(String ucapanTambahan){
        System.out.println(ucapanTambahan);
    }
    public static void main(String[]args){
         UcapanTerimakasih();
         String ucapanTambahan = ("I love You More");
        ucapanTambahan(ucapanTambahan);
     }


   
    
}