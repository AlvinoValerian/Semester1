import java.util.Scanner;

public class segitigaSudut {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalSudut;

        System.out.println("Input Sudut1:");
        sudut1 =input.nextFloat();
        System.out.println("Input Sudut1:");
        sudut2 =input.nextFloat();
        System.out.println("Input Sudut1:");
        sudut3 =input.nextFloat();
        //segitiga sama sisi,segitiga sembarang,segitiga sama kaki
        // sudut1=100;
        // sudut2=40;
        // sudut3=40;
        totalSudut=sudut1+sudut2+sudut3;

        if (totalSudut == 180){
             if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");

            }else if (sudut1 == sudut2 && sudut2 == sudut3){
                System.out.println("Segitiga Sama Sisi");
            }
                else if (sudut1==sudut2 || sudut2==sudut3 || sudut3==sudut1){
                    System.out.println("Seitiga Sama Kaki");
            }else
                System.out.println("Segitiga Sembarang");
            }
            else
                 System.out.println("Tidak Di Temukan");    
        
        input.close();
    }
}
