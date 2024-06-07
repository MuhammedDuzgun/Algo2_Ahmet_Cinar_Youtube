package Bolum_7_Ornek_Soru_Cozumu;

public class Demo2 {

    static int donguSayac = 0;
    static int sayac = 0;

    public static void main(String[] args) {

        /*
        * Kendisine parametre olarak gelen int dizisi icerisinde kac tane 5 oldugunu bulan recursive metodu
        * yazalim.
        * */

        int[] aranacakDizi = {1,2,3,4,5,6,7,8,9,0, 5,5,5,5,5,5};

        bulBes(aranacakDizi);


    }

    public static void bulBes(int[] argDizi) {
        if(donguSayac >= argDizi.length) {
            System.out.println("Dizide  : " + sayac + " adet 5 vardir");
        } else {
            if(argDizi[donguSayac] == 5) {
                sayac += 1;
            }
            donguSayac += 1;
            bulBes(argDizi);
        }

    }

}
