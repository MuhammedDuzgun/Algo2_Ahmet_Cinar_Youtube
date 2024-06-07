package Bolum_10_Interface_Ve_Dahili_Siniflar;

class Dis_Class {

    class Ic_Class_1 {
        public void selamVer() {
            System.out.println("Merhaba - Ic Class 1");
        }
    }

    class Ic_Class_2 {
        public void selamVer() {
            System.out.println("Merhaba - Ic Class 2");
        }
    }

}

public class Demo2 {

    public static void main(String[] args) {

        Dis_Class.Ic_Class_1  icClass1 = new Dis_Class().new Ic_Class_1();

        icClass1.selamVer();

        Dis_Class.Ic_Class_2 icClass2 = new Dis_Class().new Ic_Class_2();

        icClass2.selamVer();

    }

}
