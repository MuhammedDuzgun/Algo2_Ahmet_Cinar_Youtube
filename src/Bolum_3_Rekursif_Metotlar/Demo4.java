package Bolum_3_Rekursif_Metotlar;

public class Demo4 {

    public static void main(String[] args) {

        /*
        * Faktoriyel islemi yapan rekursif metodu yazalim.
        * */

        int sonuc = faktoriyelBul(5);

        System.out.println("Faktoriyel Sonucu : " + sonuc);

    }

    public static int faktoriyelBul(int argDeger) {
        if(argDeger < 1) {
            return 1;
        } else {
            return argDeger * faktoriyelBul(argDeger - 1);
        }
    }

}
