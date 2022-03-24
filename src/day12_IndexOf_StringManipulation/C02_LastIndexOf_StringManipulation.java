package day12_IndexOf_StringManipulation;

public class C02_LastIndexOf_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "ile";

        int ilkKulanim = cumle.indexOf(kelime);//ilk kullanıldıgı yerin indexini verir.
        int ikinciKullanim = cumle.lastIndexOf(kelime); //son kullanıldıgı yerin indexini verir.

        if (ilkKulanim == -1){
            System.out.println("Hiç kullanılmamış");
        } else if (ilkKulanim == ikinciKullanim) {
            System.out.println("Bir defa kullanılmış");
        } else {
            System.out.println("Birden fazla kullanılmış");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("p",4)); //4 de dahil.
    }
}
