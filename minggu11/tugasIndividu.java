// import java.util.Scanner;

// /**
//  * tugasIndividu
//  */
// public class tugasIndividu {

//     public static void main(String[] args) {
//         Scanner input =new Scanner(System.in);

//         System.out.println("Masukkan nilai: ");
//         int N = input.nextInt();

//         for (int i=0;i<=N;i++) {
//             for (int j=1;j<=i;j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//         input.close();
//     }
// }

// no1
// import java.util.Scanner;

// public class tugasIndividu {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Masukkan Nilai N: ");
//         int N = sc.nextInt();

//         int i = 1;
//         while (i <= N) {
            
//             int spaces = N - i;
//             while (spaces > 0) {
//                 System.out.print(" ");
//                 spaces--;
//             }
//             int j = 1;
//             while (j < i) {
//                 System.out.print(j);
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//         sc.close();
//     }
// }

// no2
import java.util.Scanner;

public class tugasIndividu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        int i = N;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}

// no3

// import java.util.Scanner;

// public class tugasIndividu {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Masukkan Nilai Angka: ");
//         int angka = input.nextInt();

//         for (int i=1; i<= angka ;i++) {
//             for(int j=1; j<= angka ;j++){
//                 if (i==1 || i==angka || j==1 || j==angka) {
//                     System.out.print(angka+" ");
//                 }else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//         input.close();
//     }
// }
