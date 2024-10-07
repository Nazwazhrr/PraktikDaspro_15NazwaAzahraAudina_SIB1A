import java.util.Scanner;
/**
 * Pemilihan2Percobaan215
 */
public class Pemilihan2Percobaan215 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String menu;
        String member;
        int pilihan_menu;
        double total_bayar;
        double harga;
        double diskon;

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input15.nextInt();
        input15.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input15.nextLine();
        System.out.println("---------------------------------------");
        if (member.equalsIgnoreCase("y")){//Menggunakan equalsIgnoreCase untuk membandingkan string
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1){
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        }else if (pilihan_menu == 2){
            harga = 3000;   
            System.out.println("Harga ice tea = " + harga);

        }else if (pilihan_menu == 3){
            harga  = 15000;
            System.out.println("Harga bulding = " + harga);

        }else{
            System.out.println("Masukkan pilihan menu dengan benar");
            return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
        }

        //  Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);   
        }else if (member.equalsIgnoreCase("n")){ // Menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

        }else if (pilihan_menu == 2){
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        }else if (pilihan_menu == 3){
            harga = 15000;
            System.out.println("Harga budling = " + harga);

        }else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return; // menghentikan eksekusi lebih jika pilihan salah
        }
        // Menghitung total bayar
        System.out.println("Total bayar = " + harga);

    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("------------------------------------------");
    }
}
    

