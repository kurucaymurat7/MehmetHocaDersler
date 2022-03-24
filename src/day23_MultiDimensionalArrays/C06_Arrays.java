package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        //verilen arraye bir eleman ekleme yapın..
        int[] array = {3, 5, 7};
        int eklenecekelement = 4;
        array = arrayeElemanEkle(array, eklenecekelement);
        System.out.println(Arrays.toString(array));
        array = arrayeElemanEkle(array, 11);
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayeElemanEkle(int[] array, int eklenecekelement) {
        int[] yeniArray = new int[array.length+1];
        // yeniArray = array; 3 elemanlı eski arrayi kopyalar...
        for (int i = 0; i < array.length; i++) {
            yeniArray[i] = array[i];
        }
        yeniArray[yeniArray.length-1] = eklenecekelement;
        return yeniArray;
    }
}
