public class programku {
    public static void TampilHinggaKeI(int i){
        for (int j=0; j<=i ;j++) {
            System.out.print(j);
        }
    }
    public static int Jumblah(int bill,int bill2){
        return(bill + bill2);
    }
    public static void TampilJumblah(int bill, int bill2){
        TampilHinggaKeI(Jumblah(bill, bill2));
    }
    public static void main(String[] args) {
        int temp = Jumblah(1, 1);
        TampilJumblah(temp, 5);
    }
}
