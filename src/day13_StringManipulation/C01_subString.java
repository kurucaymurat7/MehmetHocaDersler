package day13_StringManipulation;

public class C01_subString {
    public static void main(String[] args) {
        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));//ile cok guzel
        System.out.println(str.substring(5,8));//ile

        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));

        System.out.println(str.substring(9)); //IT cok guzel

        //Eger bir index'ten sona kadar olan bolumu degil de
        //belirli bir parça almak istersek 2 parametre yazmalıyız.
        System.out.println(str.substring(9,15)); // 9 dahil, 15 hariç
        System.out.println(str.substring(0,1));//J
        System.out.println(str.substring(5,6));//6.harfi string olarak alır.

        String str1 = "Java gun gectikce guzellesiyor";
        System.out.println(str1.substring(7,7));//bosluk yani hiçlik verir.
        //System.out.println(str1.substring(7,6));//hata verir.
        //System.out.println(str.substring(5,2));//hata verir. Bitiş indexi başlangıçtan küçük olamaz.

        System.out.println(str1.substring(str1.length()-1));
        System.out.println(str1.substring(str1.length()-5));

        System.out.println(str1.substring(str1.length()));//hiçlik verir.

    }
}
