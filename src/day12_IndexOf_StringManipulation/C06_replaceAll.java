package day12_IndexOf_StringManipulation;

public class C06_replaceAll {
    public static void main(String[] args) {
        //isim soyisim al, butun harfleri yıldız yap.

        String isim = "Murat Kurucay 1234";

        System.out.println(isim.replaceAll("\\s", "*"));
        System.out.println(isim.replaceAll("\\S", "/"));
        System.out.println(isim.replaceAll("\\w", "+"));
        System.out.println(isim.replaceAll("\\W", "-"));
        System.out.println(isim.replaceAll("\\d", "?"));
        System.out.println(isim.replaceAll("\\D", "!"));

        // REGULAR EXPRESSIONS.
        // \\s space. Space'leri
        // \\S bosluk dısındaki tum karakterler;
        // \\w harfler ve rakamlar.
        // \\W harf ve rakamlar dışındaki her şey
        // \\d rakamlar (0-9)
        // \\D rakamlar dışındaki tüm karakterler space de dahil.
    }
}