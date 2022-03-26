package day26_ForEach_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEach {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 11};

        //for each loop ile
        //for each loop için hedef bir Collections vermeliyiz.
        List <Integer> list = new ArrayList<>();
        for (int each: arr) {
            list.add(each);
        }
        System.out.println(list);

        int toplam = 0;
        for (int each : arr) {
            if (each%2==0) {
                System.out.println(each);
            }
        }
    }
}
