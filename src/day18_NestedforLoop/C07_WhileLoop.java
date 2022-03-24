package day18_NestedforLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //kac sayi toplamak istedigini alın
        //bu sayilari alin ve toplamı yazdırın.

        int sayiadedi = 3;

        int i = 1;
        int sayi = 0;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        for (i = 1; i<= sayiadedi; i++) {
            System.out.println("Sayi giriniz");
            sayi= scan.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println(toplam);

        i=1;
        sayi = 0;
        toplam = 0;
        while (i<=sayiadedi) {
            System.out.println("Sayi giriniz");
            sayi= scan.nextInt();
            toplam=toplam+sayi;
            i++;
        }
        System.out.println(toplam);
    }
}
