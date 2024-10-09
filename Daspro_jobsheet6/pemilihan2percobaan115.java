import java.util.Scanner;
/**
 * pemilihan2percobaan115
 */
public class pemilihan2percobaan115 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int tahun = input15.nextInt();

        // Cek apakah tahun habis dibagi 400 terlebih dahulu
        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
        } 
        // Jika tidak, cek apakah habis dibagi 100
        else {
            if (tahun % 100 == 0) {
                System.out.println("Bukan Tahun Kabisat");
            }
            // Jika tidak habis dibagi 100, cek apakah habis dibagi 4
            else {
                if (tahun % 4 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        }
    }
}