package day12_IndexOf_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
            //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
            //        - Girilen kelime cumlede kullanilmamis.
            //        - Girilen kelime cumlede 1 kere kullanilmis.
            //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkKulanim = cumle.indexOf(kelime);
        int ikincikullanım = cumle.indexOf(kelime,ilkKulanim+1);

        if (ilkKulanim==-1){
            System.out.println("Girilen kelime kullanılmamış");
        } else if (ikincikullanım==-1){
            System.out.println("Girilen kelime bir defa kullanışmıştır.");
        } else {
            System.out.println("Girilen kelime birden fazla kullanılmıştır.");
        }
    }
}
