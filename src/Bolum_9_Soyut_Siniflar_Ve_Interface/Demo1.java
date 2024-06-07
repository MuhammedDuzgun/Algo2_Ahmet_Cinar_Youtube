package Bolum_9_Soyut_Siniflar_Ve_Interface;

abstract class Personel {
    String pozisyon = "Personel";
    public abstract void calis();

    public void zamIste() {
        System.out.println("Zam Yap");
    }

}

class Programci extends Personel {

    String pozisyon = "Programci";

    @Override
    public void calis() {
        System.out.println(pozisyon + " Calisti");
    }
}

class TestProgramci extends Programci {

    String pozisyon = "Test Programci";

    @Override
    public void calis() {
        System.out.println(pozisyon + " Calisti");
    }
}

public class Demo1 {

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

        Personel p = new Programci();
        p.calis();
        p.zamIste();

        System.out.println("--------------------");

        Programci p1 = new TestProgramci();
        p1.calis();

    }

}
