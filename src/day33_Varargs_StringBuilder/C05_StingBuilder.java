package day33_Varargs_StringBuilder;

public class C05_StingBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Ali Can");

        String str = "Ali Can";

        /*
        Compara, ilk harften itibaren tum harfleri karsilastirir.  Ayni olan
        karakterler icin birsey yazmaz.
        farklı olanlar icin ASCII deger farkına gore bir sonuc doner.
         */
        System.out.println(sb1.compareTo(sb2)); // 0, farklı ise sonuc anlamsiz olur.


     /*
     Bir String ile Bir SB compare edersek
      */

        // System.out.println(sb1.compareTo("Ali Can")); // kabul etmez, hata verir.

    }
}
