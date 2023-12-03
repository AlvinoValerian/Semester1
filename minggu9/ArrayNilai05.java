import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];

        for (int i=0  ;i<nilaiAkhir.length ;i++) {
            System.out.print("Masukkan Nilai Ke-"+i+" : ");
            nilaiAkhir [i]= input.nextInt();
        }
        for (int i=0 ;i<nilaiAkhir.length; i++) {
            if (nilaiAkhir [i] >70){
            System.out.println("Nilai Akhir Ke-"+i+" Lulus!");
            }else if (nilaiAkhir [i] <70){
            System.out.println("Nilai Akhir Ke-"+i+" Tidak Lulus! ");
            }
        }
        input.close();
    }
}
