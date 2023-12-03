import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x,int y){
        if(y==0){
            System.out.print("1x");
            return 1;
        }else{
            int hasil = x * hitungPangkat(x, y-1);
            if(y==1){
                System.out.print(x);
            }else{
                System.out.print("x"+x);
            }
            return hasil;
        }
    }
    public static void main(String[] args) {
        int bilangan,pangkat;
        Scanner sc= new Scanner(System.in);
        System.out.print("Bilangan Yang Dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Bilangan Yang Dipangkat ");
        pangkat = sc.nextInt();

        System.out.print("hitungPangkat("+bilangan +","+ pangkat+") Dicetak ");

        int hasilPangkat = hitungPangkat(bilangan, pangkat);

        System.out.println(" = " + hasilPangkat);

        sc.close();
    }
}
