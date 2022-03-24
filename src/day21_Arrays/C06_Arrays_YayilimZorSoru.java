package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_Arrays_YayilimZorSoru {
    public static void main(String[] args) {
        //Bir dizi içerisindeki en uzak yayılımı hesapla.

        int[] array = {1, 1, 2, 1, 4, 1, 4, 0, 0, 2, 1};
        int yayilim = 0;
        int enbuyukyayilim = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[i] == array[j]) {
                    yayilim = j - i + 1;
                }
                if (yayilim > enbuyukyayilim) {
                    enbuyukyayilim = yayilim;
                }
            }
        }
        System.out.println(enbuyukyayilim);
        //System.out.println(Array.get());

    }

}


        /*
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length-1 ; j++) {
                if (array[i] == array[j]) {
                    yayilimdizisi [sayac] = j-i+1;
                    sayac++;
                }
            }
        }
        System.out.println(Arrays.toString(yayilimdizisi));

        int enbuyukyayilim = 0;
        for (int i = 0; i < yayilimdizisi.length-1; i++) {
            if (yayilimdizisi[i+1] > enbuyukyayilim) {
                enbuyukyayilim = yayilimdizisi[i+1];
            }
        }
        System.out.println(enbuyukyayilim); */

