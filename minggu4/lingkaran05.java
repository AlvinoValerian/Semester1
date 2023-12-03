import java.util.Scanner;

public class lingkaran05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r;
        double luas, keliling,phi = 3.14;
        System.out.println("Masukkan Jari-Jari");
        r =input.nextInt();

        luas = phi*r*r;
        keliling = 2*3.14*r;

        System.out.println("luas:" +luas);
        System.out.println("keliling:" +keliling);

        input.close();

    
        
    }
}
