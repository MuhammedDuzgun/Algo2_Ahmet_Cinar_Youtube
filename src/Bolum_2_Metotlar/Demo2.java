package Bolum_2_Metotlar;

public class Demo2 {

    public static void main(String[] args) {

        /*
        * Kendisine parametre olarak gelen iki boyutlu sayi dizisi icerisindeki en buyuk sayiyi ve yerini(satir ve sutun) bulan ve geri donduren metodu yazalim
        * return degeri int[] olacak ve icerigi soyle olacak : {maksSayi, mSatir, mSutun}
        * */

        int[][] deneyDizi = {{1,2,3}, {4,5,6}, {7,8,9}};

        //matrisMaksElemanBul(deneyDizi);

        int[] ciktiDizi = matrisMaksElemanBul(deneyDizi);

        System.out.print("   En buyuk eleman : " + ciktiDizi[0]);
        System.out.print("  Satir : " + ciktiDizi[1]);
        System.out.print("  Sutun : " + ciktiDizi[2]);

    }

    public static int[] matrisMaksElemanBul(int[][] argDizi) {
        int satir = argDizi.length;         // matris satır bulma
        int sutun = argDizi[0].length;      // matris sutun bulma

        //System.out.println("satir sayisi =  " + satir + "   sutun sayısı : " + sutun);

        int maksSayi = argDizi[0][0];
        int mSatir = 0;
        int mSutun = 0;

        for(int i=0; i<satir; i++) {
            for (int j=0; j<sutun; j++) {
                if(argDizi[i][j] > maksSayi) {
                    maksSayi = argDizi[i][j];
                    mSatir = i;
                    mSutun = j;
                }
            }
        }

        int[] arananDizi = {maksSayi, mSatir, mSutun};
        return arananDizi;
    }

}
