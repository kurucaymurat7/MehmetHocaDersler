package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        int array[][] = {{3, 1, 7}, {6, 10, 2}};
        System.out.println(array[0][1]);
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.deepToString(array));
    }
}
