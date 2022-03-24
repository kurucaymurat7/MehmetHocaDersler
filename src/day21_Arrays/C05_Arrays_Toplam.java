package day21_Arrays;

import java.util.Arrays;

public class C05_Arrays_Toplam {
    public static void main(String[] args) {
        // Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int toplam = 0;

        for (int i = 0; i <= array.length-1; i++) {
            toplam = toplam + array[i];
            }
        System.out.println(toplam);
    }
}
