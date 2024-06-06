package Bolum_4_Dosya_Ve_Try_Catch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_3_File_2 {

    public static void main(String[] args) {

        /*
        * Var olan ali.txt dosyasina "deneme" stringi ekleyelim
        * */

        try {
            File file = new File("ali.txt");
            FileWriter fileWriter = new FileWriter(file, true);

            fileWriter.write("deneme");

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Hata oluştu : " + e.getMessage());
        }



    }

}
