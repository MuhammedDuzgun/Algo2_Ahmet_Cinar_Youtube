package Bolum_7_Ornek_Soru_Cozumu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {

        /*
        * sayilar.txt dosyasina 1-1000 arasında rastgele 100 adet sayi yazililiyor.
        * bu dosya icindeki sayilar icinde 17'e bolunenleri sayilar17.txt dosyasina yazan programi yazalim.
        * */

        dosyaOlustur();
        dosya17();

    }

    public static void dosyaOlustur() {
        try {
            File file = new File("sayilar.txt");
            FileWriter fileWriter = new FileWriter(file, true);

            for (int i = 1; i <= 100; i++) {
                int sayi = (int) (Math.random() * 1000);
                fileWriter.write(String.valueOf(sayi) + "\n");
            }

            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Hata Olustu : " + e.getMessage());
        }
    }

    public static void dosya17() {
        try {
            File file = new File("sayilar.txt");
            File file_17  = new File("sayilar17.txt");

            FileWriter fileWriter = new FileWriter(file_17);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int sayi = scanner.nextInt();
                if(sayi % 17 == 0) {
                    fileWriter.write(String.valueOf(sayi) + "\n");
                }
            }

            fileWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Hata Olustu : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Hata Olustu : " + e.getMessage());
        }

    }

}
