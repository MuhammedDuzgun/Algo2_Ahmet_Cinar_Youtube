package Bolum_10_Interface_Ve_Dahili_Siniflar;

interface Sinif {
    void yoklama();
}

interface Klimali {
    void klimaCalistir();
}

abstract class A implements Sinif{

}

class B extends A{

    @Override
    public void yoklama() {

    }
}

//Coklu Kalitim
class BD1 implements Sinif, Klimali{

    @Override
    public void yoklama() {
        System.out.println("BD1 Yoklama Alindi.");
    }

    @Override
    public void klimaCalistir() {
        System.out.println("BD1 Klima Calistirildi");
    }
}

public class Demo1 {

    public static void main(String[] args) {

        /*
        * 1) yerel siniflar icinde bulunduklari yordamin sadece 'final' olan degiskenlerine ulasabilirler
        * 2) yerel siniflar statik veya non-static yordamlarin icerisinde tanimlanabilirler
        * 3) yerel siniflar; private, protedted, public erisim belirleyicilerine sahip olamazlar. Sadece friendly olabilirler
        * 4) yerek siniflar static olarak isaretlenemez.
        * 5) ayni turde kalitim icin = extends (interface - interface), (class - class), (class - abstract class)
        * 6) farkli turde kalitim icin = implements (class - interface), (abstract class - interface)
        * */

        // Referans Sinif oldugu icin klimaCalistir yok
        Sinif bd1 = new BD1();
        bd1.yoklama();

        System.out.println("------------------------");

        BD1 bd11 = new BD1();
        bd11.yoklama();
        bd11.klimaCalistir();


    }

}
