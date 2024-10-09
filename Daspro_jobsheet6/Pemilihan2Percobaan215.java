import java.util.Scanner;

/**
 * Pemilihan2Percobaan215
 */
public class Pemilihan2Percobaan215 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int pilihanMenu;
        String member, jenisPembayaran;
        double totalBayar, diskon = 0, harga, potonganqris = 1000;

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl (Rp. 14.000)");
        System.out.println("2. Ice Tea (Rp. 3.000)");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea) (Rp. 15.000)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihanMenu = input15.nextInt();
        input15.nextLine(); // Untuk menghindari karakter newline yang tersisa
        System.out.print("Apakah punya member (y/n)? ");
        member = input15.nextLine();
        System.out.print("Metode pembayaran (qris/cash): ");
        jenisPembayaran = input15.nextLine();
        System.out.println("---------------------------------------");

        // Menghitung harga berdasarkan pilihan menu
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga paket bunding = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return; // Menghentikan eksekusi jika pilihan salah
        }

        // Menghitung diskon untuk member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            totalBayar = harga - (harga * diskon);
            System.out.println("Besar diskon 10%");
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        } else if (member.equalsIgnoreCase("n")) {
            totalBayar = harga; // Jika bukan member
            System.out.println("Total bayar = " + totalBayar);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        // Potongan untuk pembayaran qris
        if (jenisPembayaran.equalsIgnoreCase("qris")) {
            totalBayar -= potonganqris; // Mengurangi total bayar dengan potongan QRIS
            System.out.println("Potongan qris sebesar Rp. 1.000");
        }

        // Menampilkan total bayar akhir
        System.out.println("Total bayar setelah potongan qris = " + totalBayar);
        System.out.println("---------------------------------------------");
    }
}