import java.util.Scanner;

public class TugasC {
    private static final String SECRET_PIN = "123456";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Kantin Tadika Mesra!");
        Scanner scanner = new Scanner(System.in);
        
        for (int attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
            System.out.print("Masukkan PIN: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(SECRET_PIN)) {
                System.out.println("PIN benar. Akses diberikan.");
                break;
            } else {
                System.out.print("\nPIN salah. ");
                if(attempts == 3) System.exit(0);
                System.out.print("Coba lagi.\n");
            }
        }

        System.out.println("Pilih Menu.");
        //loop menu
        scanner.close();
    }
}