import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        double totalHargaPenjualan = 0, harga;
        int hargaTiket = 50000, totalTiket = 0, tiket;
        String namaPelanggan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk berhenti): ");
        namaPelanggan = sc.nextLine();

        while (!namaPelanggan.equalsIgnoreCase("selesai")) {

            System.out.print("Masukan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();
            sc.nextLine();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukan jumlah tiket kembali!");
                continue;
            }

            harga = hargaTiket * tiket;

            if (tiket > 10) {
                harga -= harga * 0.15;
            } else if (tiket > 4) {
                harga -= harga * 0.10;
            }

            System.out.println("=== Detail ===");

            System.out.println("Nama Pelanggan: " + namaPelanggan);
            if (tiket > 10) {
               System.out.println("Diskon 15%");

            } else if (tiket > 4) {
               System.out.println("Diskon 10%");
            }
            System.out.println((tiket > 4 )? "Total harga tiket sebelum diskon: " + tiket * hargaTiket + "\nTotal harga setelah diskon: "+ harga : "Total harga tiket: "+ harga);
            totalHargaPenjualan += harga;
            totalTiket += tiket;

            System.out.print("\nMasukkan nama pelanggan (ketik 'selesai' untuk berhenti): ");
            namaPelanggan = sc.nextLine();
        }

        System.out.println("\n=== Total Penjualan Tiket Dalam 1 hari ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan: Rp " + totalHargaPenjualan);

        sc.close();
    }
}
