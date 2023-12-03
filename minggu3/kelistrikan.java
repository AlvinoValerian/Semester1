
    import java.util.Scanner;

    public class kelistrikan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double omh1, omh2, omh3 ;
        int omh4, i;
        double totalHambatan,V;


        System.out.println("masukkan R1:");
        omh1 = sc.nextDouble();

        System.out.println("masukkan R2:");
        omh2 = sc.nextDouble();

        System.out.println("masukkan R3:");
        omh3 = sc.nextDouble();

        System.out.println("masukkan R4:");
        omh4 =sc.nextInt();

        System.out.println("masukkan i:");
         i = sc.nextInt();

        totalHambatan = ( 1/omh1 + 1/omh2 + 1/omh3) + omh4;
        V = (totalHambatan * i);

        System.out.println("Hasil:" + V);


        
        sc.close();
    }
}

        
    

