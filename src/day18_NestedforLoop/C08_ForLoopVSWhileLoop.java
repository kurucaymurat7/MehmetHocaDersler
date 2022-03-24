package day18_NestedforLoop;

import java.util.Scanner;

public class C08_ForLoopVSWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan toplamak istediği sayıları alın ve kullanıcı 0'a basana kadar devam edin.
        //0'a basınca toplamı yazdırın.


        int sayiadedi = 3;

        int i = 1;
        int sayi = 0;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        //Mantıklı değil ama olabilir.

        for (i = 1; i<= 10000; i++) {
            System.out.println("Sayi giriniz");
            sayi= scan.nextInt();
            if (sayi == 0) {
                break;
            } else {
                toplam=toplam+sayi;
            }
        }
        System.out.println(toplam);

        //While ile daha mantıklı...
        sayi = 1;
        toplam = 0;
        while (sayi!=0) {
            System.out.println("Sayi giriniz");
            sayi= scan.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println(toplam);
    }
}
