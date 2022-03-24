package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(1);
        sayilar.add(7);

        int index1 = 6;
        int index2 = 2;

        // Index degerleri sırasına bakmadan hangisi ilkindex, hangisi ikinci index ona karar verir.
        int ilkIndex = (index1<index2) ? index1: index2;
        int ikinciIndex = (index1>index2) ? index1: index2;

        System.out.println(sayilar); // ilk hali yazdir
        sayilar = swapElements(sayilar, ilkIndex, ikinciIndex); //metodu çagır.
        System.out.println(sayilar); // son hali yazdır.

    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //indexleri kontrol et
        //verilen iki indexteki elemanlari yer degistir.

        // ilk indexi bulduktan sonra, ilkindex'ten son index'e kadar nested for çalıştır,
        // ilk index degerini, ikinci index degerine ata
        // ilk index'e de temp degerini ata.
        int temp;
        for (int i = 0; i < sayilar.size(); i++) {
            if (i == ilkIndex) {
                temp = sayilar.get(ilkIndex);
                for (int j = ilkIndex; j < sayilar.size(); j++) {
                    if (j==ikinciIndex) {
                        sayilar.set(ilkIndex, sayilar.get(ikinciIndex));
                        sayilar.set(ikinciIndex, temp);
                    }
                }
            }
        }
        return sayilar;
    }
}