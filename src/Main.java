import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Aplikasi Menu Makanan ===");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mie Goreng - Rp12000");
        System.out.println("3. Ayam Geprek - Rp18000");
        System.out.println("4. Sate Ayam - Rp20000");
        System.out.println("=============================");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        String namaMakanan = "";
        int harga = 0;

        if (pilihan == 1) {
            namaMakanan = "Nasi Goreng";
            harga = 15000;
        } else if (pilihan == 2) {
            namaMakanan = "Mie Goreng";
            harga = 12000;
        } else if (pilihan == 3) {
            namaMakanan = "Ayam Geprek";
            harga = 18000;
        } else if (pilihan == 4) {
            namaMakanan = "Sate Ayam";
            harga = 20000;
        } else {
            System.out.println("Pilihan tidak tersedia!");
            System.exit(0);
        }

        System.out.print("Masukkan jumlah porsi: ");
        int porsi = input.nextInt();

        int total = harga * porsi;

        System.out.println("-----------------------------");
        System.out.println("Pesanan Anda:");
        System.out.println("Menu   : " + namaMakanan);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("Porsi  : " + porsi);
        System.out.println("Total  : Rp" + total);
        System.out.println("-----------------------------");

        input.close();
    }
}
