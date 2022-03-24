package day15_MethodCreation;

import java.util.Scanner;

public class C11_MethodCreationLoop {
    public static void main(String[] args) {
        //Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
        //degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
        //yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi
        //girdiniz, ben toplayamam” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç sayi gireceksiniz ?");
        int sayiAdet = scan.nextInt();
        int toplam = 0;
        if (sayiAdet >= 2 && sayiAdet <= 4) {
            int sonuc = toplamiBul(sayiAdet, toplam);
            System.out.println(sonuc);
        } else if (sayiAdet >= 5) {
            System.out.println("Çok sayi girdiniz.");
        }
    }

    public static int toplamiBul(int sayiAdet, int toplam) {
        for (int i = 1; i <= sayiAdet; i++) {
            System.out.println(i + ".sayi");
            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();
            toplam = toplam + sayi;

        }
        return toplam;
    }
}
