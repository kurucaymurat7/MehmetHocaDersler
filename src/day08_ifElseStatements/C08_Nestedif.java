package day08_ifElseStatements;

import java.util.Scanner;

public class C08_Nestedif {
    public static void main(String[] args) {
        //Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifre giriniz : ");
        String sifre = scan.next();

        if (sifre.charAt(0) == 'A') {
            System.out.println("Gecerli sifre");
        } else if (sifre.charAt(0) == 'z') {
            System.out.println("Gecerli sifre");
        } else {
            System.out.println("Gecersiz sifre");
        }
    }
}
