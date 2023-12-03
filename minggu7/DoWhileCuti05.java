import java.util.Scanner;

public class DoWhileCuti05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti,jumblahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti:");
        jatahCuti =sc.nextInt();

        do {
            System.out.print("Apakah Anda Ingin Mengambil Jatah Cuti (y/t)? ");
            konfirmasi=sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumblah Hari");
                jumblahHari=sc.nextInt();

                if(jumblahHari <= jatahCuti) {
                    jatahCuti -= jumblahHari;
                    System.out.println("Sisa Jatah Cuti: " +jatahCuti);

                }else{
                    System.out.println("Sisa Jatah Cuti Tidak Mencukupi");
                    System.out.println("Sisa Jatah Cuti: " +jatahCuti);
                    continue;
                }
            }if (konfirmasi.equalsIgnoreCase("t")){
                    System.out.println("Program keluar");
                    break;
            }

        } while (jatahCuti > 0);

        sc.close();
    }
}
