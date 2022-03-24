package day12_IndexOf_StringManipulation;

public class C04_Replace_StringManipulation {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok kolay";
        System.out.println(str.replace("a", "xxx"));
        System.out.println(str.replace("a", "")); //a'ları siler.
        System.out.println(str.replace('J', ':'));

        String str1 = "Java ogrenmek cok kolay"; //Space'leri sil uzunluk bul.
        System.out.println(str1.replace(" ", "").length()); //Cumledeki bosluklari silerek uzunlugunu yazar.

        // Java yerine C#, kolay yerine zor yazdır.
        str1 = str1.replace("Java", "C#").replace("kolay", "zor"); //kelimeleri yenileri ile değiştirir.
        str1 = str1.replace("cok zor", "gayret gerektirir.");
        System.out.println(str1);

        str1 = "Java ogrenmek cok cok kolay";
        str1 = str1.replaceAll("cok", "az");
        //str1 = str1.replaceAll("\\s") // \\s space. \\S bosluk dısındaki tum karakterler;
                                            // \\w harfler ve rakamlar.
                                            // \\W har ve rakamlar dışındaki her şey
                                            // \\d rakamlar (0-9)
                                            // \\D rakamlar dışındaki tüm karakterler
        System.out.println(str1);
    }
}
