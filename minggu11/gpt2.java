import java.util.Scanner;

public class gpt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int N = sc.nextInt();

        int i = 1;
        while (i <= N) {
            
            int spaces = N - i;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            int j = 1;
            while (j < i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
