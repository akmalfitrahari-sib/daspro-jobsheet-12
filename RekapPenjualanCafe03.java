public class RekapPenjualanCafe03 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    
    public static void menu03(String[] menu) {   
    System.out.println("=== Daftar menu === ");
        for (String item : menu) {
            System.out.println("- " + item);
        }

    }

    static int[][] dataPenjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 30, 6},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    public static void tabel() {
        System.out.printf("%-15s", "Menu");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d\t", i);
        }
        System.out.println();

        for (int j = 0; j < menu.length; j++) {
            System.out.printf("%-15s", menu[j]);
            for (int k = 0; k < 7; k++) {
                System.out.printf("%d\t", dataPenjualan[j][k]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int max, int index) {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += dataPenjualan[i][j];
            if (total > max) {
                max = total;
                index = i;
            }
        }
        System.out.println();
        System.out.print("=== Menu dengan total penjualan tertinggi ===\n");
        System.out.println(menu[index] + " = " + max);
    }

    public static void rata2() {
        System.out.println();
        System.out.println("=== Rata-rata penjualan setiap menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += dataPenjualan[i][j];
            double avg = total / 7.0;
            System.out.printf("%-15s: %.2f\n", menu[i], avg);
        }
    }
    public static void main(String[] args) {
        menu03(menu);
        System.out.println();
        tabel();
        menuTertinggi(-1, 0);
        rata2();
    }
}
