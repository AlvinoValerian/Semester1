import java.util.Scanner;

public class forKelipatan05{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int kelipatan,jumblah=0,counter=0;
        double rata2;

        System.out.print("Masukkan Bilangan Kelipatan (1-9):");
        kelipatan=scan.nextInt();

        for  (int i=1; i <=50; i++){
            if (i % kelipatan==0){
                jumblah += i;
                counter++;      
            }
        }
            rata2 = (double)jumblah/counter;
            System.out.printf("Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
            System.out.printf("Total Bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,jumblah);
            System.out.printf("Total %d : Counter %d Rata-Rata = %.2f",jumblah,counter,rata2);
            
            //for;
            // inisialisasi : kondisi : literasi
            // penjelasan ketika i kurang dari 50 akan melaukan pengecekan 
            // if jikahasil bagi antara i dan kelipatan =0 maka total akan dijumblahkan pada i dan counterbertambah 1,
            // ketika selesai akan ketahap selanjutanya i akan bertambah 1 dan dicek lagi i masihkuran dari 50 
            // jika true akan berulang lagi

            // double rata2= total/counter;





        // for (int cetak=0; cetak<5;cetak++){
        //     System.out.println(cetak+"hello word");
        // }
        //     int hasil=0;
        //   for (int cetak=1; cetak<=5;cetak++){
        //     System.out.println("cetak: "+cetak+" + "+"hasil: "+hasil);
        //     hasil= hasil+cetak;
        
        // System.out.println("Total: " +hasil);
        //   }

        // while
        //  int i=1;
        // while  (i <=50){
        //     if (i % kelipatan==0){
        //         jumblah += i;
        //         counter++;      
        //     }
        // }i++;
            




        scan.close();
    }
}