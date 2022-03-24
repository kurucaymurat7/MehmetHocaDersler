package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_Arrays_TekOgeSilme {
    public static void main(String[] args) {

        //Java’daki bir dizideki öğeyi silme.
        //Silinmek istenen degeri silerek ve diziyi 1 azaltarak yeni diziyi verir.

        int[] array, yeniarray;
        array = new int[]{3, 4, 3, 6, 5, 8, 9, 6, 8};

        Scanner scan = new Scanner(System.in);

        System.out.println("Silinecek deger = ");
        int silinecekdeger = scan.nextInt();
        yeniarray = new int[array.length - 1];

        int i = 0;
        for (i = 0; i <= array.length - 1; i++) {
            if (array[i] == silinecekdeger)
                break;
            yeniarray[i] = array[i];
        }

        for (int j = i; j < yeniarray.length; j++) {
            yeniarray[j] = array[j + 1];
        }

        System.out.println(i);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(yeniarray));
    }

}

