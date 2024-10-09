import java.util.Scanner;
/**
 * Pemilihan2Percobaan315
 */
public class Pemilihan2Percobaan315 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
       

        //Input kategori dan penghasilan
        System.out.print("Masukkan kategori (pebisnis/pekerja): ");
        kategori = input15.next();
        System.out.print("Masukkan penghasilan: ");
        penghasilan = input15.nextInt();
        
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih = " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih = " + gajiBersih);
        } else {
            System.out.println("Masukkan Kategori Salah!");
        }
    }
}
        
    
    

