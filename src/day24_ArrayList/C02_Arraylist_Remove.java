package day24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_Arraylist_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        //ADD...
        isimler.add("Aykut");
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        //REMOVE... OBJECT...
        boolean sonuc = isimler.remove("Aykut"); //true dönecek. İlk Aykutu siler. boolean deger doner...
        if(sonuc == true) {
            System.out.println("İstediğiniz isim silindi.");
        } else {
            System.out.println("İstediğiniz isim olmadığından silinemedi.");
        }

        System.out.println(sonuc);// TRUE or FALSE yazar...
        System.out.println(isimler);
        isimler.remove("İlker");
        System.out.println(isimler);

        sonuc = isimler.remove("Berk");
        System.out.println(sonuc);
        if(sonuc == true) {
            System.out.println("İstediğiniz isim silindi.");
        } else {
            System.out.println("İstediğiniz isim olmadığından silinemedi.");
        }

        //REMOVE... INDEX...index'e gider ve siler...
        String silinenisim = isimler.remove(0);
        System.out.println("Silinen isim = " + silinenisim);
        System.out.println(isimler.remove(1));//1. index'teki elemanı siler ve delil olarak o elemanı bize döndürür.


        //REMOVE ALL...
        isimler.removeAll(Collections.singleton("Aykut")); //tüm Aykutları siler.
        System.out.println(isimler);
    }
}
