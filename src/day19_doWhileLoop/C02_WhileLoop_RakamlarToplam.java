package day19_doWhileLoop;

public class C02_WhileLoop_RakamlarToplam {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int sayi = 123;
        int basamaktoplami = 0;
        int basamaksayisi = String.valueOf(sayi).length();
        System.out.println("Girdiginiz sayı " + basamaksayisi + " basamaklidir");

        while (basamaksayisi!=0) {
            //for (int i=basamaksayisi; i>=1; i--)
            {
                basamaktoplami= basamaktoplami + (sayi % 10);
                sayi /= 10;
            }
            basamaksayisi=basamaksayisi-1;
        }

        System.out.println("Sayinin basamaklari toplami = " + basamaktoplami);
    }
}
