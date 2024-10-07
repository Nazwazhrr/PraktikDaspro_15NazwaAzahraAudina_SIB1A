import java.util.Scanner;
/**
 * Pemilihan2Percobaan115
 */

 /**
  * pemilihan2percobaan115
  */
 public class pemilihan2percobaan115 {
     public static void main(String[] args) {
         Scanner input15 = new Scanner(System.in);
    
         System.out.print("Masukkan tahun : ");
         int tahun = input15.nextInt();
    
     if ((tahun % 4== 0 && tahun % 100 !=0) || (tahun % 400 == 0)) {
        System.out.println("Tahun Kabisat");
     }else
     System.out.println("Bukan Tahun Kabisat");
     }    
}
