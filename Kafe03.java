import java.util.Scanner;
public class Kafe03 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("Kode Promo Anda: " + kodePromo);
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Promo berhasil! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Promo berhasil! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid atau tidak tersedia.");
        }
        System.out.println("==== MENU RESTO CAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan."); 
    }
        public static int hitungTotalHarga03(int pilihanMenu, int banyakItem, String kodePromo){
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            double diskon = 0;

             if (kodePromo.equalsIgnoreCase("DISKON50")) {
                diskon = hargaTotal*0.50;
                System.out.println("Anda mendapatkan diskon 50%: Rp " + (int)diskon);
            } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                diskon = hargaTotal*0.30;
                System.out.println("Anda mendapatkan diskon 30%: Rp " + (int)diskon);
            } else {
            System.out.println("Kode promo invalid atau tidak tersedia.");
            }
            return (int)(hargaTotal-diskon);
        }
        public static void main(String[] args) {
            Menu("Andi", "DISKON50", true);
            Scanner sc = new Scanner(System.in);
            String kodePromo = "DISKON50";

            int totalPesanan = 0;
            int pilihanMenu;

            while (true) {
                System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) atau (0) untuk keluar: ");
                pilihanMenu = sc.nextInt();

                if(pilihanMenu==0) {
                    break;
                }
                System.out.print("Masukkan jumlah item yang dipesan: ");
                int banyakItem = sc.nextInt();

                int totalHarga = hitungTotalHarga03(pilihanMenu, banyakItem, kodePromo);
                totalPesanan += totalHarga;
            
                System.out.println("Subtotal pesanan ini: Rp" + totalHarga);
            }
            System.out.println("========================================");
            System.out.println("Total harga untuk pesanan Anda: Rp " + totalPesanan);
        }
}  
