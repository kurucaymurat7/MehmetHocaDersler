package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_Arrays_Enbuyukikincisayiyibulma {
    public static void main(String[] args) {
        //Java’daki bir dizide en büyük ikinci sayıyı bulma

        int[] array;
        array = new int[]{3, 4, 2, 6, 5};

        int enbuyuksayi = 0;
        int enbuyukikincisayi = 0;

        Arrays.sort(array); //kucukten buyuge siralama islemi.
        System.out.println(Arrays.toString(array));
        int enkucuksayi = array[0]; //en kucuk ogeyi yazdirir.

        //En buyuk ogeyi bulur.
        for (int i = 0; i < 5; i++) {
            if (array[i] > enbuyuksayi) {
                enbuyuksayi = array[i];
            }
        }

        //En buyuk ikinci ogeyi dondurur.
        for (int i = 0; i < 5; i++) {
            if (array[i] > enbuyukikincisayi && array[i] != enbuyuksayi) {
                enbuyukikincisayi = array[i];
            }
        }
        System.out.println("En buyuk sayi = " + enbuyuksayi);
        System.out.println("En buyuk ikinci sayi = " + enbuyukikincisayi);
        System.out.println("En kucuk sayi = " + enkucuksayi);
    }
}
