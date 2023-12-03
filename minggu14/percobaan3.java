import java.util.Scanner;

public class percobaan3 {
    static double hitungLaba(double saldo,int tahun){
        if (tahun ==0 ) {
            return (saldo);
        }else{
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumblah Saldo Awal : ");
        double saldoAwal =sc.nextDouble();
        System.out.println("Lamanya Inventaris (tahun) : ");
        int tahun =sc.nextInt();

        System.out.print("Jumblah Saldo Setelah "+tahun+ " Tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
        sc.close();
    }
}
