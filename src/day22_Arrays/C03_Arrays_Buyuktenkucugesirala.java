package day22_Arrays;

import java.util.Arrays;

public class C03_Arrays_Buyuktenkucugesirala {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int tersArr[] = new int[arr.length];

    public static void main(String[] args) {
        TersineSirala(arr);
        System.out.println(Arrays.toString(tersArr));
    }

    public static int[] TersineSirala(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }
        return tersArr;
    }
}

