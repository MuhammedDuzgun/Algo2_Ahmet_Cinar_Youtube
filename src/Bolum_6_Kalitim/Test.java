package Bolum_6_Kalitim;

public class Test {

    public static void main(String[] args) {

        /*
        * Parent ref. uzerinden child class method larina
        * erisim yapilamaz.
        * */
        Parent_Class p = new Child_Class();
        p.pMethod();

        Child_Class c = new Child_Class();
        c.pMethod();
        c.cMethod();

    }

}
