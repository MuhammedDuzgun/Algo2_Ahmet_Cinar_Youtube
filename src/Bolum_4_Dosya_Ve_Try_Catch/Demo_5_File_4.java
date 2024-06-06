package Bolum_4_Dosya_Ve_Try_Catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo_5_File_4 {

    public static void main(String[] args) {

        /*
        * veli.txt dosyasindaki verileri okuyup ekrana yazan programi yazalim.
        * */

        try {
            File file = new File("veli.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextInt());
            }

            scanner.close();
        } catch (FileNotFoundException e) {

        }



    }

}
