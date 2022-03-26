package day26_ForEach_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
        //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] array1 = {"Ali", "Ayse", "Can", "Fatma", "Murat"};
        String[] array2 = {"Can", "Evren", "Emsal", "Murat", "Fatma", "Emre"};

        List<String> ortakelemanlar = new ArrayList<String>();

        for (String each1:array1) {
            for (String each2:array2) {
                if (each1.equals(each2)) {
                    if (!(ortakelemanlar.contains(each1))) {
                        ortakelemanlar.add(each1);
                    }
                }
            }
        }

        if (ortakelemanlar.isEmpty()) {
            System.out.println(" ortak eleman yok ");
        } else {
            System.out.println("iki listedeki ortak elemanlar " + ortakelemanlar );
        }
    }
}