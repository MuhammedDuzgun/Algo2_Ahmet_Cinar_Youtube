package Bolum_2_Metotlar;

public class Demo1 {

    public static void main(String[] args) {

        /*
        * kendisine parametre olarak gelen string dizisi içerisinde en uzun string bulan metodu yazalim
        * */

        String[] dizi = {"a", "aa", "bbb","cccc", "sdjhfskdnfksjnfAKNFŞKAQNFGŞQANGRFŞK", "AŞLSDALMSD"};

        String s = enUzunString(dizi);

        System.out.println(s);


    }

    public static String enUzunString(String[] strDizi) {
        int maxString = 0;
        String hedefStr = "";

        for (String strEleman : strDizi) {
            if(strEleman.length() > maxString) {
                maxString = strEleman.length();
                hedefStr = strEleman;
            }
        }
        return hedefStr;
    }

}
