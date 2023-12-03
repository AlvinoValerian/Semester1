public import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        // Inisialisasi array
        int[] arr = new int[n];

        // Input nilai-nilai elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Menghitung nilai tertinggi, nilai terendah, dan rata-rata
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / n;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);

        input.close();
    }
}
 {
    
}
