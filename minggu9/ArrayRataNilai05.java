import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, rata2;
        int mahasiswaLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] >= 70) {
                mahasiswaLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-Rata Nilai: " + rata2);
        System.out.println("Jumlah Mahasiswa Yang Lulus: " + mahasiswaLulus);

        input.close();
    }
}
