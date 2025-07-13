import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafe cafe = new Cafe();

        // Daftar menu cafe
        MenuItem[] menu = {
            new MenuItem("Kopi Hitam", 10000),
            new MenuItem("Cappuccino", 15000),
            new MenuItem("Es Teh", 8000),
            new MenuItem("Roti Bakar", 12000),
            new MenuItem("Nasi Goreng", 18000)
        };

        System.out.println("=== Selamat Datang di Cafe ===");

        // ✅ Inisialisasi langsung
        char lanjut = 'y';

        do {
            System.out.println("\nMenu Cafe:");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%d. %-15s - Rp%,.0f%n", (i + 1), menu[i].getNama(), menu[i].getHarga());
            }

            int pilihan = 0;
            int jumlah = 0;

            try {
                System.out.print("Pilih nomor menu: ");
                pilihan = scanner.nextInt();

                if (pilihan < 1 || pilihan > menu.length) {
                    System.out.println("❌ Menu tidak tersedia.");
                    continue;
                }

                System.out.print("Jumlah pesanan: ");
                jumlah = scanner.nextInt();

                if (jumlah <= 0) {
                    System.out.println("❌ Jumlah harus lebih dari 0.");
                    continue;
                }

                cafe.tambahPesanan(menu[pilihan - 1], jumlah);
            } catch (InputMismatchException e) {
                System.out.println("❌ Masukkan angka yang valid.");
                scanner.nextLine(); // Clear buffer
                continue;
            }

            System.out.print("Tambah pesanan lagi? (y/n): ");
            lanjut = scanner.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        // Tampilkan nota akhir
        cafe.cetakNota();
        scanner.close(); // Menutup scanner
    }
}
