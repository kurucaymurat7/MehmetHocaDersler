package day03_scanner;

import java.util.Scanner;

public class C04_Scanner_İsimSoyisim {
    public static void main(String[] args) {
        //Scanner için 3 adım. Önce kendimize scanner oluşturalim.
        Scanner scan= new Scanner(System.in);

        //Kullanıcından istediğimiz değeri almak için metin yazalım
        System.out.println("Lütfen isminizi giriniz");

        //Kullanıcının girdiği değeri uygun bir variable oluşturup kaydedelim.
        //String kullaniciİsmi = scan.next(); //sadece ilk kelimeyi alır (space'e kadar olan kısım)
        String kullaniciİsmi = scan.nextLine(); //tüm satırı alır

        //Kullanıcı ismini yazdır
        System.out.println("Kullanıcı İsmi = " + kullaniciİsmi);
    }
}
