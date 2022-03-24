package day25_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Lİsts {
    public static void main(String[] args) {
        ///*
        //         * Kullanicidan int  list uzunlugunu isteyin
        //         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
        //         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
        //         *
        //         * n = 5 icin (listin uzunlugu);
        //         * input { 1 , 2 , 2 , 3 , 4}
        //         * output {2}
        //         *
        //         */

        System.out.println("Kaç elemanlı bir Liste olacak ? ");
        Scanner scan = new Scanner(System.in);
        int listuzunluk = scan.nextInt();
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < listuzunluk; i++) {
            System.out.println(i+1 + ". eleman : ");
            sayilar.add(Integer.valueOf(scan.next()));
        }

        List<Integer> yeniSayilar = new ArrayList<>(); // Yeni bir Lİst oluştur.

        //Sayilar listesinde her bir index için, kendinden sonraki indexlerde aynı eleman var mı diye kontrol et.
        // Eğer aynı eleman varsa VE yeniSayilar List, bu elemana sahip değilse, elemanı yeniList'e ekle.

        for (int i = 0; i < sayilar.size(); i++) {
            for (int j = i+1; j < sayilar.size(); j++) {
                if (sayilar.get (i) == sayilar.get (j) && !yeniSayilar.contains(sayilar.get (i))) {
                    yeniSayilar.add(sayilar.get (i));
                }
            }
        }

        System.out.println(yeniSayilar);

    }
}
