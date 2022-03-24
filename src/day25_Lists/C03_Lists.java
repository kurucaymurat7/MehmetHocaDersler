package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Lists {
    public static void main(String[] args) {
        int array [] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 3;

        istenmeyenElemaniSilveYazdir (array, istenmeyenEleman);
    }

    public static void istenmeyenElemaniSilveYazdir(int[] array, int istenmeyenEleman) {
        List<Integer>  yeniList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != istenmeyenEleman) {
                yeniList.add(array[i]);
            }
        }
        System.out.println(yeniList);
        // bu noktadan sonra gerekirse, array'e de atılabilir. Size belli sonuçta: )

        int[] yeniarray = new int [yeniList.size()];
        for (int i = 0; i < yeniList.size(); i++) {
            yeniarray [i] = yeniList.get(i);
        }
        System.out.println(yeniList);
    }
}
