package Bolum_3_Rekursif_Metotlar;

public class Demo1 {

    public static void main(String[] args) {

        /*Rekursif metodun ozellikleri:
        * 1.kendi kendini cagiracak
        * 2.icinde dongu olmayacak
        * 3.icinde degisken tanimlanamaz.
        * 4. Durma noktası olacak
       */

        //ekrana 10 defa isim bastiran r. metot yazalim.
        isimYazdir("Muhammed", 10);

    }

    public static void isimYazdir(String argIsım, int sayac) {
        if (sayac >= 1) {
            System.out.println(argIsım);
            isimYazdir(argIsım, sayac-1);
        }
    }
}
