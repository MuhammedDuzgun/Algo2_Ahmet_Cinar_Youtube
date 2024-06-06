package Bolum_4_Dosya_Ve_Try_Catch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_4_File_3 {

    public static void main(String[] args) {

        /*
        * veli.txt dosyasina 1'den 300'e kadar olan sayilardan 13'e kalansiz bolunenleri yazalim
        *
        * */

        try {
            File file = new File("veli.txt");
            FileWriter fileWriter =  new FileWriter(file, true);
            for (int i = 1; i <= 300; i++) {
                if(i%13 == 0) {
                    fileWriter.write(i + "\n");
                }
            }

            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Hata Meydana Geldi  : " + e.getMessage());
        }

    }

}
