package day22_Arrays;

import java.util.Arrays;

public class C07_Arrays_StringtoArray {
    public static void main(String[] args) {
        String str = "Java her gun iyi gidiyor";
        String[] arr = str.split(",");
        System.out.println(arr[0]); //Ahmet
        System.out.println(Arrays.toString(arr));
        String[] arr1 = str.split("");
        System.out.println(Arrays.toString(arr1));
    }
}
