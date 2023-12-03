/**
 * coba
 */
public class coba {

    public static void main(String[] args){
        
                String pesan = "Selamat Datang di Kantin                                       ";
                
                while (true) {
                    System.out.print("\r" + pesan);
                    try {
                        Thread.sleep(200); // Menunggu 200 milidetik sebelum menggeser pesan
                        pesan = geserTeks(pesan);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        
            public static String geserTeks(String pesan) {
                char[] pesanArray = pesan.toCharArray();
                char lastChar = pesanArray[pesanArray.length - 1];
                for (int i = pesanArray.length - 1; i > 0; i--) {
                    pesanArray[i] = pesanArray[i - 1];
                }
                pesanArray[0] = lastChar;
                return new String(pesanArray);
            
        
            }
        }
    