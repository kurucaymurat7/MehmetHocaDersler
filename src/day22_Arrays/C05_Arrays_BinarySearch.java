package day22_Arrays;

import java.util.Arrays;

public class C05_Arrays_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9};
        int istenensayi = 6;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,6)); //index verir.
        System.out.println(Arrays.binarySearch(arr, 20));//-10 verdi.
        System.out.println(Arrays.binarySearch(arr, -62));//-1 verir.

    }
}
