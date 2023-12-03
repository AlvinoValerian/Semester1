import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int alas, tinggi;
      float luas;
      System.out.print("masukkan alas: ");
      alas = sc.nextInt();
      System.out.print("masukan tinggi: ");
      tinggi = sc.nextInt();
      luas = alas * tinggi /2;
      System.out.println("luas segitiga: " + luas);

     sc.close();
    }
}
