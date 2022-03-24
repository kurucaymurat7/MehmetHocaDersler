package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C12_Arrays_Copy {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6 };
        int[] array2 = {0, 0, 0, 0, 0, 0};

        System.arraycopy(array2, 2, array1, 3, 2);
        for (int i : array2)
            System.out.println(i);
        for (int i : array1)
            System.out.println(i);

    }
}
