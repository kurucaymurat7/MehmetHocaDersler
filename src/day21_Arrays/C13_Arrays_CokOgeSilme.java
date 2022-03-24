package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C13_Arrays_CokOgeSilme {
    public static void main(String[] args) {

        //tekrar eden ogelerin hepsini array'den siler.

        int[] array, yeniarray;
        array = new int[]{3, 3, 1, 3, 3, 1, 3, 1, 2, 3, 0, 0, 0};
        System.out.println("Orijinal Dizi = " + Arrays.toString(array));

        Scanner scan = new Scanner(System.in);

        System.out.println("Silinecek deger = ");
        int silinecekdeger = scan.nextInt();
        int silenecekadet = 0;

        //Öncelikle silinecek ogenin dizide kac tane oldugu belirlenir.
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] == silinecekdeger) {
                silenecekadet++;
            }
        }

        //yeni dizinin uzunnlugu belirlenir, dizi olusturulur.
        yeniarray = new int[array.length - silenecekadet];

        //orijinal dizi, sıra ile kontrol edilir ve silienecek degere eşitse, o index boş bırakılır
        //sonraki degerler, sırası ile yeni diziye atanır.
        int i = 0;
        int silinecekindex = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == silinecekdeger) {
                silinecekindex++;
            } else {
                yeniarray [i-silinecekindex] = array [i];
            }
        }

        System.out.println("Silme islemiden sonra = " + Arrays.toString(yeniarray));
    }

}

