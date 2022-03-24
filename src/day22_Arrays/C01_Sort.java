package day22_Arrays;


import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[] = {"Sa", "Me", "Af", "Ti"};
        Arrays.sort(arr);  //sort eder, sıralar.
        System.out.println(Arrays.toString(arr));
        Arrays.binarySearch(arr, "M");
        System.out.println(Arrays.binarySearch(arr, "M"));//dizideki indexini verir.
    }
}
