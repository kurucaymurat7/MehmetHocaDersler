package day19_doWhileLoop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C10_Loop_doWhile_SifreKontrol {
    ///Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
    ////edin ve sifredeki hatalari yazdirin.
    ////Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
    ////girdiginde "Sifreniz Kabul edilmistir" yazdirin.
    //
    ////Sifre kucuk harf icermelidir
    ////Sifre buyuk harf icermelidir
    ////Sifre özel karakter icermemelidir
    ////Sifre en az 8 karakter olmalidir.

    static boolean buyukharfkontrol = false;
    static boolean kucukharfkontrol = false;
    static boolean ozelkarakterkontrol = false;
    static int sifreuzunluk = 0;
    static String sifre;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lütfen şifre giriniz: ");
            sifre = scan.next();
            sifreuzunluk = sifre.length();

            buyukharfkontrol = buyukharfkontrolEt(sifre, sifreuzunluk);
            kucukharfkontrol = kucukharfkontrolEt(sifre, sifreuzunluk);
            ozelkarakterkontrol = ozelkarakterkontrolEt(sifre, sifreuzunluk);
            if (sifreuzunluk < 8) {
                System.out.println("Şifre en az 8 karakter içermelidir...");
            }

        } while (buyukharfkontrol = false || kucukharfkontrol == false || sifreuzunluk < 8 || ozelkarakterkontrol == true);
    }

    public static boolean ozelkarakterkontrolEt(String sifre, int sifreuzunluk) {
        for (int i = 0; i < sifreuzunluk; i++) {
            if ((sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') ||
                    (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') ||
                    (sifre.charAt(i) > 0 && sifre.charAt(i) < 9)) {
                ozelkarakterkontrol = false;
            } else {
                ozelkarakterkontrol = true;
            }
        }
        if (ozelkarakterkontrol == true) {
            System.out.println("Ozel karakter kullanmayınız. ");
        }
        return ozelkarakterkontrol;
    }


/*
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sifre);
        boolean ozelkarakterkontrol = matcher.find();
        if (ozelkarakterkontrol == false) {
            System.out.println("Ozel karakter kullanilmamistir. ");
        }
        return ozelkarakterkontrol; */

    public static boolean kucukharfkontrolEt(String sifre, int sifreuzunluk) {
        for (int i = 0; i < sifreuzunluk - 1; i++) {
            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                kucukharfkontrol = true;
            }
        }
        if (kucukharfkontrol == false) {
            System.out.println("En az bir adet kucuk harf kullanmalısınız. ");
        }
        return kucukharfkontrol;
    }

    public static boolean buyukharfkontrolEt(String sifre, int sifreuzunluk) {
        for (int i = 0; i < sifreuzunluk - 1; i++) {
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                buyukharfkontrol = true;
            }
        }
        if (buyukharfkontrol == false) {
            System.out.println("En az bir adet buyuk harf kullanmalısınız. ");
        }
        return buyukharfkontrol;
    }
}