package Bolum_13_Thread_Kullanimi;

public class Demo1 {

    public static void main(String[] args) {

        /*
        * 1) Thread'lerdki run() metoduna dogrudan erisilemez. Bunun yerine Thread icinde bir start() metodu
        * yazilir ve start metodu cagirilir.
        *
        *
        *
        * */

        MyThread thread = new MyThread("Thread_1");
        MyThread thread1 = new MyThread("Thread_2");
        MyThread thread2 = new MyThread("Thread_3");
        MyThread thread3 = new MyThread("Thread_4");
        MyThread thread4 = new MyThread("Thread_5");

        thread.startMyThread();
        thread1.startMyThread();
        thread2.startMyThread();
        thread3.startMyThread();
        thread4.startMyThread();

    }

}
