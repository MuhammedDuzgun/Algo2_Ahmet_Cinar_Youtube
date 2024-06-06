package Bolum_4_Dosya_Ve_Try_Catch;

import java.io.*;

public class Demo_2_File_1 {

    public static void main(String[] args) {

        /*
        * ali.txt dosyasina 1'den 10'a kadar olan sayilari satir satir yazalim.
        * */

        try {
            File file = new File("ali.txt");
            PrintWriter printWriter = new PrintWriter(file);

            for(int i=1; i<=10; i++) {
                printWriter.println(i);
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı");
        }

    }

}
