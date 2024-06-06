package Bolum_3_Rekursif_Metotlar;

public class Demo3 {

    static int diziSayac = 0;
    static String maxString = "";

    public static void main(String[] args) {

        /*
            Kendisine parametre olarak gelen tek boyutlu string dizisi icerisindeki
            en uzun karaktere sahip string'i ekrana yazdiran rekursif metodu yaziniz.
        */

        String[] aranacakDizi = {"aa","bb", "ccc", "dddd", "eeeee", ""};

        maksStringBul(aranacakDizi);

    }

    public static void maksStringBul(String[] argString) {
        if(diziSayac >= argString.length) {
            System.out.println(maxString);
        } else {
            if(argString[diziSayac].length() > maxString.length()) {
                maxString = argString[diziSayac];
            }
            diziSayac += 1;
            maksStringBul(argString);
        }

    }


}
