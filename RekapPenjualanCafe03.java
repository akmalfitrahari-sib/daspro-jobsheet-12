import java.util.Scanner;
public class RekapPenjualanCafe03 {
    static String[] menu;
    static int[][] dataPenjualan;
    static int jmlMenu, jmlHari;
    
    public static void menu03() {   
    System.out.println("=== Daftar menu === ");
        for (String item : menu) {
            System.out.println("- " + item);
        }

    }

    public static void tabel() {
        System.out.printf("%-15s", "Menu");
        for (int i = 1; i <= jmlHari; i++) {
            System.out.printf("Hari %d\t", i);
        }
        System.out.println();

        for (int j = 0; j < jmlMenu; j++) {
            System.out.printf("%-15s", menu[j]);
            for (int k = 0; k < jmlHari; k++) {
                System.out.printf("%d\t", dataPenjualan[j][k]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int max = -1;
        int index = 0;
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) total += dataPenjualan[i][j];
            if (total > max) {
                max = total;
                index = i;
            }
        }
       
        System.out.println("\n=== Menu dengan total penjualan tertinggi ===");
        System.out.println(menu[index] + " = " + max);
    }

    public static void rata2() {
        System.out.println("\n=== Rata-rata penjualan setiap menu ===");
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) total += dataPenjualan[i][j];
            double avg = total / (double) jmlHari;
            System.out.printf("%-15s: %.2f\n", menu[i], avg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu : ");
        jmlMenu = sc.nextInt();
        sc.nextLine();

        menu = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.print("\nMasukkan jumlah hari penjualan: ");
        jmlHari = sc.nextInt();

        dataPenjualan = new int[jmlMenu][jmlHari];

        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jmlMenu; i++) {
            for (int j = 0; j < jmlHari; j++) {
                System.out.print(menu[i] + " hari ke-" + (j+1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();
        menu03();
        System.out.println();
        tabel();
        menuTertinggi();
        rata2();

        sc.close();
    }
}
