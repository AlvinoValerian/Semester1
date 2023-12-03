import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        int s,V,L;
        Scanner input =new Scanner(System.in);
        System.out.println("Masukkan Nilai Sisi: ");
        s =input.nextInt();

        L=hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus Adalah: " + L);

        V=hitungVolume(s);
        System.out.println("Volume Kubus Adalah: " + V);

        input.close();
    }
    static int hitungVolume(int sisi){
        int hitungVolume = sisi*sisi*sisi;
        return hitungVolume;
    }
    static int hitungLuasPermukaan(int sisi){
        int luasPermukaan = 6*sisi*sisi;
        return luasPermukaan;
    }
}
