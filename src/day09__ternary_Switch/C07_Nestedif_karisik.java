package day09__ternary_Switch;

import java.util.Scanner;

public class C07_Nestedif_karisik {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olan sayiyi yazdirin
        int sayi1=4;
        int sayi2=6;
        int sonuc=sayi1>sayi2 ? sayi1 : sayi2;
        System.out.println(sonuc);

        // Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        int sayi3=2;
        System.out.println(sayi3>=0 ? sayi3 : sayi3*-1);

        //Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere gore
        //dikdorgenin kare olup olmadigini yazdirin.
        int kenar1 = 5, kenar2=6;
        System.out.println(kenar1==kenar2 ? "kare" : "dikdörgen");

        //Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa “Uc
        //basamakli degil” yazdirin
        int sayi4 = 456;
        System.out.println(sayi4>99 && sayi4<1000 ? "üç basamaklı" : "değil");

        //Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
        //consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Karakter girin :");
        char karakter = scan.next().charAt(0);
        System.out.println((karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z')?
                (karakter>='A'&& karakter<='Z')?"BÜYÜK HARF" : "küçük harf" :
                "karakter değil");

        //Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den
        //kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin.
        System.out.println("Sayı giriniz :");
        int sayi = scan.nextInt();
        String sonuc2 = (sayi>=10)?
                (sayi<=100)?"2 basamaklı sayı" : "3 basamaklı sayı" :
                "rakam";
        System.out.println(sonuc2);
    }
}
