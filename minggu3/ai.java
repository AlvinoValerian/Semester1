import java.util.Scanner;

public class ai {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Halo, saya AI sederhana. Apa yang bisa saya bantu?");
        
        while (true) {
            System.out.print("Anda: ");
            String pertanyaan = input.nextLine();
            
            String jawaban = generateJawaban(pertanyaan);
            System.out.println("AI: " + jawaban);
            
            System.out.print("Apakah ada yang lain yang bisa saya bantu? (ya/tidak): ");
            String lanjutkan = input.nextLine();
            
            if (lanjutkan.equalsIgnoreCase("tidak")) {
                break;
            }
        }
        
        System.out.println("Terima kasih telah berbicara dengan AI sederhana ini!");
        input.close();
    }
    
    public static String generateJawaban(String pertanyaan) {
        if (pertanyaan.contains("siapa")) {
            return "Saya adalah AI sederhana.";
        } else if (pertanyaan.contains("apa")) {
            return "Itu tergantung pada konteksnya.";
        } else {
            return "Saya tidak mengerti pertanyaan Anda.";
        }
    }
}


