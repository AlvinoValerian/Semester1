import java.util.Scanner;

public class TugasMahasiswa {
    static Scanner input = new Scanner(System.in);

    public static void inputNilai(int[][] nilaiMhs) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print("Nilai [" + i + "][" + j + "]= ");
                nilaiMhs[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilNilai(int[][] nilaiMhs) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.println("Nilai mhs" + i + " hari" + j + "=" + nilaiMhs[i][j]);
            }
        }
    }

    public static int getHarikeNilaiMax(int[][] nilaiMhs) {
        int hariKe = 0;
        int nilaiMax = nilaiMhs[0][0];
        for (int j = 0; j < nilaiMhs[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < nilaiMhs.length; i++) {
                totalHari += nilaiMhs[i][j];
            }
            if (totalHari > nilaiMax) {
                nilaiMax = totalHari;
                hariKe = j;
            }
        }
        return hariKe + 1;
    }

    public static int[] getMhskeNilaiMax(int[][] nilaiMhs) {
        int mhsKe = 0;
        int hariKe = 0;
        int nilaiMax = nilaiMhs[0][0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                if (nilaiMhs[i][j] > nilaiMax) {
                    nilaiMax = nilaiMhs[i][j];
                    mhsKe = i;
                    hariKe = j;
                }
            }
        }

        int[] hasil = {hariKe + 1, mhsKe + 1, nilaiMax};
        return hasil;
    }

    public static void main(String[] args) {
        int[][] dataNilai = new int[5][7];

        inputNilai(dataNilai);
        tampilNilai(dataNilai);

        int hariTertinggi = getHarikeNilaiMax(dataNilai);
        System.out.println("Nilai Tertinggi terdapat pada Hari ke-" + hariTertinggi);

        int[] hasil = getMhskeNilaiMax(dataNilai);
        System.out.println("Nilai Tertinggi: " + hasil[2] + " pada minggu ke-" + hasil[0] +
                           " oleh Mahasiswa ke-" + hasil[1]);
    }
}
