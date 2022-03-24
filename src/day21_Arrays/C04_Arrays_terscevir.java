package day21_Arrays;

import java.util.Arrays;

public class C04_Arrays_terscevir {
    //Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
    //program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int yeniarray [] = new int [array.length];

        for (int i = 0; i < array.length-1; i++) {
            if (i !=array.length-1) {
                yeniarray[i] = array[i + 1];
            }
            else {
                yeniarray[i] = array[0];
            }
        }
        System.out.println(Arrays.toString(yeniarray));
    }
}
