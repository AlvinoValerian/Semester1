import java.util.Scanner;

public class WhileKelipatan05 {
    public static void main(String[] args) {

        int kelipatan,jumblah=0,counter=0;
        Scanner scan = new Scanner(System.in);

         System.out.print("Masukkan Bilangan Kelipatan (1-9):");
        kelipatan=scan.nextInt();

         int i=1;
        while  (i <=50){
            if (i % kelipatan==0){
                jumblah += i;
                counter++;      
            }
        }i++;
        System.out.printf("Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
        System.out.printf("Total Bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,jumblah);
    
        scan.close();
    }
}
