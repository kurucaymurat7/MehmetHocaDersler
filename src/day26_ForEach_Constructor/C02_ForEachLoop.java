package day26_ForEach_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // 10 elementli bir list oluştur.
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> sayilar = new ArrayList<>();

        for (int each:arr) {
            sayilar.add(each);
        }

        for (int each:arr) {
            if (each/3!=0){
                System.out.println(each + "");
            }
        }

    }
}
