import java.util.Scanner;

public class gaji05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int jmlMasuk,jmlTdkMasuk;
        double gaji, potGaji,totalGaji;

        System.out.println("Berapa Besaran Gaji:");
        gaji =input.nextDouble();

        System.out.println("Berapa Potongan Gaji:");
        potGaji =input.nextDouble();

        System.out.println("Berapa Hari Masuk:");
        jmlMasuk =input.nextInt();

        System.out.println("Berapa Hari Tidak Masuk");
        jmlTdkMasuk =input.nextInt();

        totalGaji=(gaji*jmlMasuk)-(potGaji*jmlTdkMasuk);

        System.out.println("Gaji Yang Di Terima:"+totalGaji);

        input.close();

    }
    
}
