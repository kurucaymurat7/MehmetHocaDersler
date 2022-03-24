package day13_StringManipulation;

public class C02_subString {
    public static void main(String[] args) {

        //1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayisi 100'den kucukse
        //az ise "az sonuc bulundu"

         String str = "1-48 of 7000 results for \"nutella\""; //ters slash işaretleri string devam ediyor anlamına gelir

        //2. ve 3. space index degerlerine göre aradaki sayı değeri bulunuz.

        int ilkSpace = str.indexOf(" ");
        int ikinciSpace = str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace+1);

        String aramasonucSayisiStr = str.substring(ikinciSpace+1, ucuncuSpace);
        System.out.println(aramasonucSayisiStr);

        int aramaSonucSayisiInt = Integer.valueOf(aramasonucSayisiStr);

        if (aramaSonucSayisiInt > 100) {
            System.out.println("super");
        } else {
            System.out.println("100den az");
        }

    }
}
