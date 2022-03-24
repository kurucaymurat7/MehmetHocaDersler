package day25_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_ListContains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("D"); //D
        harfler.add("M"); //D M
        harfler.add(1, "T"); // D T M
        harfler.add(0, "T"); // T D T M

        System.out.println(harfler);
        harfler.contains("T"); // true or false
        System.out.println(harfler.contains("T"));

        harfler.contains("R"); // false

        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        harfler.containsAll(karakterler); // listenin tamamı var mı diye kontrol ediyor.
        System.out.println(harfler.containsAll(karakterler));

        karakterler.add("F");
        System.out.println(karakterler.add("F"));

        Collections.sort(karakterler); // sort edecek, alfabetik sıraya göre...

        karakterler.equals(harfler); //iki List'in equal olup olmamasını karşılaştırır.
                                    // index ve içerik aynı olmalıdır.

        harfler.clear(); // listeyi temizler...
        System.out.println(harfler.isEmpty()); // true döner...
        System.out.println(karakterler.isEmpty()); //false döner...

    }
}
