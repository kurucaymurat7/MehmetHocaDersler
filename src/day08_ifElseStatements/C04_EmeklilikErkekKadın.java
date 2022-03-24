package day08_ifElseStatements;

import java.util.Scanner;

public class C04_EmeklilikErkekKadın {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyet ? \n (Erkek için E \n Kadın için K)");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Yaş ? ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("yas degerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("Emekli olamazın, daha " + (60 - yas) + " yıl çalışmalısın");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }
        else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("yas degerini kontrol edin");
            } else if (yas < 65) {
                System.out.println("Emekli olamazın, daha " + (65 - yas) + " yıl çalışmalısın");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Gecerli bir cinsiyet giriniz.");
        }
    }
}
