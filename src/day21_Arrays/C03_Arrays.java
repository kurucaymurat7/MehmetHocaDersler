package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {
        int arr [] = new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[arr.length-1]);//son karakteri yazar.
    }
}
