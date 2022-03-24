package day19_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        int negatifsayac = 0;
        int pozitifsayac = 0;
        do {
            System.out.println("Sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz...");
                negatifsayac++;
            } else if (sayi>0) {
                toplam += sayi;
                pozitifsayac++;
            }
        } while (sayi != 0);
        System.out.println("Girilen sayilar toplami = " + toplam);
        System.out.println("Girilen pozitif sayi adedi = " + pozitifsayac);
        System.out.println("Girilen negatif sayi adedi = " + negatifsayac);
    }
}
