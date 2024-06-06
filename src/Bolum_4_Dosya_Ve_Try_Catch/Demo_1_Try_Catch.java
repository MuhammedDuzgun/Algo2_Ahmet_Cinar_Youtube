package Bolum_4_Dosya_Ve_Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo_1_Try_Catch {

    public static void main(String[] args) {

        /*
        * Kullanıcıdan iki int alan ve bunlari toplayan programi try-catch yapisi icerisinde yazalim.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen İki sayi giriniz : ");

        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();

            System.out.println("Girdiğiniz sayilarin toplami : " + (sayi1 + sayi2));
        } catch (InputMismatchException e) {
            System.out.println("Yanlış formatta sayi girmeyin");
        } catch (Exception e) {
            System.out.println("Alinan hata : " + e);
        }



    }

}
