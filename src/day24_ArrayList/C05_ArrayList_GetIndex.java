package day24_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C05_ArrayList_GetIndex {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0, 7);
        sayilar.add(2, 4);

        System.out.println(sayilar.get(2)); //listede değişim olmaz. sadece indexi getirir.

        sayilar.sort(Comparator.naturalOrder());
        System.out.println(sayilar);
        sayilar.sort(Comparator.reverseOrder());
        System.out.println(sayilar);
    }
}
