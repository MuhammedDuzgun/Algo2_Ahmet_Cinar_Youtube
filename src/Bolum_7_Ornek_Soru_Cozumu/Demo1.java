package Bolum_7_Ornek_Soru_Cozumu;

public class Demo1 {

    public static void main(String[] args) {

        /*
        * Parametre olarak gelen 2 boyutlu string dizisinde alfabetik sirada en once gelen stringi ve
        *  konumunu (satir, sutun) bulup donduren metotu yazalim.
        *
        * */

        // 2 satir 3 sutundan olusan bir str dizisi
        String[][] aranacakDizi = {{"b","a","c"},{"d","e","f"}};

        String ilkStr = bul(aranacakDizi);
        System.out.println(ilkStr);

    }

    public static String bul(String[][] argDizi) {
        String arananS = argDizi[0][0];
        int satir = 0;
        int sutun = 0;

        for(int i=0; i<argDizi.length; i++) {
            for (int j=0; j< argDizi[0].length; j++) {
                if (arananS.compareTo(argDizi[i][j]) > 0) {
                    arananS = argDizi[i][j];
                    satir = i;
                    sutun = j;
                }
            }
        }

        arananS = arananS + " Satir : " + satir + " Sutun : " + sutun;

        return arananS;
    }

}
