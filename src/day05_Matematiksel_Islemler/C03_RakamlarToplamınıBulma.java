package day05_Matematiksel_Islemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı sayı giriniz : ");
        int sayi = scan.nextInt();

        int rakam=0;
        int rakamlartoplami=0;

        //ornek: sayi=1234
        rakam=sayi % 10; //4
        rakamlartoplami+=rakam;//4
        sayi/=10; //123

        rakam=sayi % 10; //3
        rakamlartoplami+=rakam; //7
        sayi/=10; //12

        rakam=sayi % 10; //2
        rakamlartoplami+=rakam; //9
        sayi/=10;//1

        rakam=sayi % 10; //1
        rakamlartoplami+=rakam; //10
        sayi/=10; //0

        System.out.println(rakamlartoplami);
    }
}
