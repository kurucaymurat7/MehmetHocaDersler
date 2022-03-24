package day21_Arrays;

import java.util.Arrays;

public class C07_ArraysTerstenYazdir {
    public static void main(String[] args) {
        //Verilen array'i tersten yazdıran program....

        int arr[]={1,2,3,4,5, 6};
        System.out.println(Arrays.toString(arr));
        for (int i =arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
