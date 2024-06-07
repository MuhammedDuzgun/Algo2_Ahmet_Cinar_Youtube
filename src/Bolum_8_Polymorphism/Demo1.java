package Bolum_8_Polymorphism;

class Parent {
    public Parent() {
        System.out.println("Hello - Parent");
    }
}

class Child extends Parent{
    public Child() {
        System.out.println("Hello - Child");
    }
}

public class Demo1 {

    public static void main(String[] args) {

        Parent p = new Parent();    //kompozisyon

        // her iki constructor calisir - Polymorphism
        Parent c = new Child();

        //Her iki constructor calisir
        Child c2 = new Child();
    }

}
