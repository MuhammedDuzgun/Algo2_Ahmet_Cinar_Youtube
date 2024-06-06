package Bolum_3_Rekursif_Metotlar;

public class Demo2 {

     static int donguSayac = 0;
     static int aramaSayac = 0;

    public static void main(String[] args) {

        //kendisine parametre olarak gelen sayi dizisi icerisinde 5 sayisi olup olmadıgini bulan rekursif metot :
        int[] aranacakDizi = {1,2,3,5,6,7,8,9,0};

        int adet = besVarmi(aranacakDizi, 4);

        System.out.println("Aranan sayi dizide " + adet + " Kadar var.");

    }

    public static int besVarmi(int[] argDizi, int aranacak) {
        if(donguSayac < argDizi.length) {
            if(argDizi[donguSayac] == aranacak) {
                aramaSayac += 1;
            }
            donguSayac += 1;
            besVarmi(argDizi, aranacak);
        }
        return aramaSayac;
    }

}
