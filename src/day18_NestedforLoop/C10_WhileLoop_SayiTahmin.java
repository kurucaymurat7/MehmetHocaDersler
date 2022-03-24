package day18_NestedforLoop;

import java.util.Random;

import java.util.Scanner;

public class C10_WhileLoop_SayiTahmin {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int randomsayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur


        Scanner scan = new Scanner(System.in);
        System.out.println("Sayiyi tahmnin ediniz:");
        System.out.print("1. adim : ");
        int tahmninsayi = scan.nextInt();

        int tahminsayisi = 1;

        while (tahmninsayi!=randomsayi) {

            if (tahmninsayi<randomsayi) {
                System.out.print((tahminsayisi +1) + ". adım. Sayiyi büyütmelisin. Tekrar dene : ");
                tahmninsayi=scan.nextInt();
                tahminsayisi++;
            } else if (tahmninsayi>randomsayi) {
                System.out.print((tahminsayisi +1)  + ". adım. Sayiyi küçültmelisin. Tekrar dene : ");
                tahmninsayi=scan.nextInt();
                tahminsayisi++;
            }
        }
        System.out.println();
        System.out.println(tahminsayisi + ".adımda buldun.");
    }
}