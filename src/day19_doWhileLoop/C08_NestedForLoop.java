package day19_doWhileLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
        //yazdirin. Kullanicinin hata yapmadigini farz edin.
        //Ornegin kullanici 3 girerse;
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        System.out.println("Sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        //for (int i = 1; i <= 10 ; i++) {
           // System.out.println(sayi + "x" + i + "=" + (sayi*i));
        //}

        for (int sayi1 = 1; sayi1 <= 10 ; sayi1++) {
            for (int sayi2 = 1; sayi2 <= 10 ; sayi2++) {
                System.out.print(sayi1 + "x" + sayi2 + "=" + (sayi1 * sayi2) + " ");
            }
            System.out.println();
        }
    }
}
