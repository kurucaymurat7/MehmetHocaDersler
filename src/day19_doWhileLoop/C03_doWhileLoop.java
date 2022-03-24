package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {

        // pozitif tamsayi al, sayıdan küçük tamsayıları yazdır.
        // While ile döngü 3 defa karşılaştırma yapar.

        int input = 3;
        int sayi = 1;
        int sayac = 1;
        while (sayi < input) {
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println(sayac);

        //doWhile ile aynı soruyu yapalım. Döngü kontrol yapar.
        sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;

        } while (sayi < input);

    }
}
