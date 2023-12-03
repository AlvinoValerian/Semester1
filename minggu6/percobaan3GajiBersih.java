import java.util.Scanner;

public class percobaan3GajiBersih {
    public static void main (String []args){
        Scanner input05=new Scanner(System.in);

        double pajak;
        int penghasilan,gajiBersih;
        String kategori;

        System.out.println("Masukkan Kategori: Pekerja/Pebisnis");
        kategori = input05.next();
        System.out.println("penghasilan:");
        penghasilan = input05.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih =(int) (penghasilan - (penghasilan*pajak));
            System.out.println("Gaji Bersih : "+gajiBersih);

        }else if (kategori.equals("Pebisnis")){
            if (penghasilan <= 2000000)
                pajak = 0.15;
            else if (penghasilan <=3000000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih=(int) (penghasilan - (penghasilan*pajak));
            System.out.println("Gaji Bersih: " +gajiBersih);

        }else 
            System.out.println("Kategori Salah");


        input05.close();
    }
}