package Bolum_5_Class_Kullanimi;

class ChildClass {

    public void selamla() {
        System.out.println("Merhaba");
    }

}

public class Demo_1 {

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();   //Kompozisyondur
        childClass.selamla();



    }

}
