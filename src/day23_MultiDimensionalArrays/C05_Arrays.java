package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //verilen arraye bir eleman ekleme yapın..

        int[] array = {3, 5, 7};
        System.out.println(Arrays.toString(array));

        array = new int[4]; //yepyeni bir array oluşturduk. 0 0 0 0.
        array = new int[array.length+1];

        int[] arrayYeni = new int[5];


        array = arrayYeni; //eski bilgileri tamamen siliniyor, yeni array değerleri alıyor.
        System.out.println(Arrays.toString(arrayYeni)); //0 0 0 0 0

        arrayYeni[0] = 2;
        arrayYeni[3] = 5;

        array = arrayYeni;
        System.out.println(Arrays.toString(array));
    }
}
