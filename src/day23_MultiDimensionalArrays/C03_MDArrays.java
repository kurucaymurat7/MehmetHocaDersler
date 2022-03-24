package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        //boyutlari belli bir arrayi elementleri girmeden girelim.
        //bir okulda içinde 24 öğrenci olan 8 sınıf vardır.
        int arr [][] = new int [8][24];

        // bir ilçede her birinde 24 öğrencilik 8 sınıf bulunan 5 okul vardır.
        int arr2 [][][] = new int[5][8][24];

        //bir okulda 3 tane 24 kişilik, 2 tane de 28 kişilik sınıf vardır.
        //Kapsamları farklı oldugu için multidimensional olmaz.
        //Ayrı ayrı 2 array olabilir.
        int sinif24 [][] = new int[3][24];
        int sinif28 [][] = new int[2][28];

        //olustururken elementleri manuel atama yaparsak, farkli uzunlukta inner arrayler olusturabiliriz.
        int array [][] = {{1,2,3,4},{0,2,5}};
        System.out.println(Arrays.deepToString(array));

    }
}
