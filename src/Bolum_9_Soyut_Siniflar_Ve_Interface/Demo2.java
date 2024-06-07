package Bolum_9_Soyut_Siniflar_Ve_Interface;

interface Hayvan {

    void sesCikar();

}

class Kedi implements Hayvan {

    @Override
    public void sesCikar() {
        System.out.println("Miyav");
    }
}

class Inek implements Hayvan {

    @Override
    public void sesCikar() {
        System.out.println("Möööö");
    }
}

public class Demo2 {

    public static void main(String[] args) {

        /*
         * abstract (soyut) class'lar ve interface'ler new'lenemez.
         * abstract class'lar abstract metotlar icerebilecegi gibi imzaya sahip olan metotlar da icerebilir.
         * abstract class'lar en az 1 abstract metot icermesi gerekir.
         * abstract class'lar uml diyagramında kesikli cizgi ile gosterilir.
         * interface'ler abstract class'lardan daha da soyut yapılardir.
         * interface'ler imza iceren hic bir metot bulunduramazlar.
         *
         * */

        Hayvan kedi = new Kedi();
        kedi.sesCikar();

    }

}
