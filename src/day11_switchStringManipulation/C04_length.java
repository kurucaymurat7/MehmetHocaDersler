package day11_switchStringManipulation;

import java.util.Locale;

public class C04_length {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp baş harfini ve son harfini büyük
        //harf olarak yazdır.
        //Türkçe karakter olarak büyük harfi yazsın.

        String isim = "ismail";
        System.out.println(""+isim.toUpperCase().charAt(0)+isim.toUpperCase().charAt(isim.length()-1));
        System.out.println(""+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println(""+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());//0

        String str2=null;
        System.out.println(str2);//null
        System.out.println(str2.length());//hata verir.
    }
}
