// import java.util.Random;
// import java.util.Scanner;

// public class quiz {
//     public static void main(String[] args) {
//         Random random = new Random();
//         Scanner input = new Scanner(System.in);

//         char menu ='y';
//         do{
//             int number = random.nextInt(10)+1;
//             boolean sukses = false;
//             do{
//                 System.out.println("Tebak Angka (1-10): ");
//                 int answer = input.nextInt();
//                 input.nextLine();
//                 sukses=(answer==number);
//             }while(!sukses);
//             System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)");
//             menu = input.nextLine().charAt(0);
//         }while(menu=='Y'||menu=='y');

//         input.close();
//     }
// }
import java.util.Random;
import java.util.Scanner;

public class TebakAngka05 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean sukses = false;

            do {
                System.out.println("Tebak Angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    sukses = true;
                } else {
                    if (answer < number) {
                        System.out.println("Angka terlalu kecil. Coba lagi.");
                    } else {
                        System.out.println("Angka terlalu besar. Coba lagi.");
                    }
                }
            } while (!sukses);

            System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'Y' || menu == 'y');

        input.close();
    }
}
