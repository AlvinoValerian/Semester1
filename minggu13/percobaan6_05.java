import java.util.Scanner;

public class percobaan6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,V;

        System.out.println("Masukkan Panjang: ");
        p = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi: ");
        t = input.nextInt();

        // L = p * l;
        // System.out.println("Luas Persegi Panjang Adalah: "+ L);
        // V = p * l * t;
        // System.out.println("Volume Persegi Panjang Adalah: "+ V);

        L=HitungLuas(p,l);
        System.out.println("Luas Persegi Panjang: "+ L);
        V=HitungVolume(t, p , l);
        System.out.println("Volume Balok Adalah: "+ V);

        input.close();
    }
    static int HitungLuas(int panjang,int lebar){
        int Luas = panjang * lebar;
        return Luas;
    }
    static int HitungVolume(int tinggi,int a,int b){
        int Volume = HitungLuas(a,b) * tinggi;
        return Volume;
    }

}
