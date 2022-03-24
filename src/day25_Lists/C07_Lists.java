package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        // bir listede ortalama üstünde olan element sayısını bulunuz.

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }
        double ortalama = toplam/sayilar.size();

        List<Double> ortalamaustundekisayilar = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>ortalama) {
                ortalamaustundekisayilar.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaustundekisayilar);
        System.out.println(ortalamaustundekisayilar.size());
    }
}
