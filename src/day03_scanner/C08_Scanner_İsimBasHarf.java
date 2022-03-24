package day03_scanner;

import java.util.Scanner;

public class C08_Scanner_İsimBasHarf {
    public static void main() {
        //Scanner için 3 adım. Önce kendimize scanner oluşturalim.
        Scanner scan= new Scanner(System.in);

        //Kullanıcından istediğimiz değeri almak için metin yazalım
        System.out.println("Lütfen isminizi giriniz: ");

        //Kullanıcının girdiği değeri uygun bir variable oluşturup kaydedelim.
        //String kullaniciİsmi = scan.next(); //sadece ilk kelimeyi alır (space'e kadar olan kısım)
        String kullaniciİsmi = scan.next(); //tüm satırı alır
        char c=kullaniciİsmi.charAt(0); //ilk karakteri alır
        String x = kullaniciİsmi.toLowerCase(); //verilen stringi lowercase yapar

        //Kullanıcı ismini yazdır
        System.out.println("Kullanıcı İsmi= " + kullaniciİsmi);
    }
}
