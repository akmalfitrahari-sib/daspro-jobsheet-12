public class Kubus03 {
    public static int volume(int sisi) {
        int volume = sisi*sisi*sisi;
        System.out.println("Volume kubus adalah " + volume);
        return volume;
    }
    public static int luasPermukaan(int sisi){
        int luasPermukaan = sisi*sisi*6;
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        volume(6);
        luasPermukaan(6);
    }
        
}
