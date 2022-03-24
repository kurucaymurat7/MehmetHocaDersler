package day12_IndexOf_StringManipulation;

public class C03_Contains_EndsWith_StartsWith {
    public static void main(String[] args) {
        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "gh";

        System.out.println(cumle.contains(kelime)); //kelime, cumlenin icinde var mı yok mu? True or False.

        //Contains
        String mail = "kurucaymurat7@gmail.com.tr";
        String arananmetin = "@gmail.com";
        if (!mail.contains(arananmetin)){
            System.out.println("geçersiz email adresi");
        } else if (mail.lastIndexOf(arananmetin)==mail.length()-10){
            System.out.println("geçerli email adresi");
        } else {
            System.out.println("email yazıma dikkat ediniz.");
        }

        //EndsWith ozelligi
        if (mail.endsWith(arananmetin)){ //ile bitiyorsa
            System.out.println("geçerli email adresi");
        } else {
            System.out.println("email yazımına dikkat ediniz.");
        }

        //StartsWith ozelligi
        if (mail.startsWith("kuru")){ //ile basliyorsa
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(mail.startsWith("u", 3)); //3.index'ten itibaren u ile mi başlıyor?

        System.out.println(mail.isEmpty());//Bos mu dolu mu?

    }
}
