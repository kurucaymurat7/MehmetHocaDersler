package day11_switchStringManipulation;

import java.util.Locale;

public class C01_Lowercase_Uppercase {
    public static void main(String[] args) {
        String str = "Java Guzeldir";
        // ikinci kelimenin ilk harfini küçük yazdıralım.
        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}