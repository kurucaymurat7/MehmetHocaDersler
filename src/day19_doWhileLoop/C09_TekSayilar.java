package day19_doWhileLoop;

public class C09_TekSayilar {
    public static void main(String[] args) {
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz

        int sayi1 = 7, sayi2 = 3;
        int kucuksayi = (sayi1 < sayi2)? sayi1: sayi2;
        int buyuksayi = (sayi1 > sayi2)? sayi1: sayi2;
        int sayac = kucuksayi;
        int teksayitoplami = 0;

        while (sayac <= buyuksayi) {
            if (sayac % 2 == 1) {
                System.out.println(sayac + " ");
                teksayitoplami += sayac;
            }
            sayac++;
        }
        System.out.println("Aradaki tek sayilar toplami = " + teksayitoplami);

    }
}
