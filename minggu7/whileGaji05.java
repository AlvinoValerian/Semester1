import java.util.Scanner;

public class whileGaji05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int jmlKaryawan,jmlJamLembur;
        double gajiLembur=0,totalGaji=0;
        String jabatan;

        System.out.println("Masukkan Jumblah Karyawan");
        jmlKaryawan=scan.nextInt();

        int i=0;
        while (i < jmlKaryawan) {
            System.out.println("Pilihan Jabatan:- Direktur,Manajer,Karyawan");
            System.out.print("Masukkan Jabatan Karyawan Ke-"+ (i+1) + ": ");
            jabatan =scan.next();
            System.out.print("Masukkan Jumblah Jam Lembur: ");
            jmlJamLembur=scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("Manajer")){
                gajiLembur= jmlJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur=jmlJamLembur * 75000;
            }else{
                System.out.println("Jabatan Invalid");
                i--;
            }
                // else{
                //     i--;
                //     System.out.println("Invalid");
                //     continue;
                // }
            totalGaji += gajiLembur;
        }System.out.println("Total Gaji: "+totalGaji);

        scan.close();
    }
}



// NB: continue mengabaikan baris dibwahnya