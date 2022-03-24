package day08_ifElseStatements;

import java.util.Scanner;

public class C06_ifElse {
    public static void main(String[] args) {
        // Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun adı giriniz ?");
        String gun=scan.next().toLowerCase(); //Büyük harfe çevir

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar");
        } else if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("carsamba") || gun.equals("persembe")) {
            System.out.println("siradan bir gun");
        } else {
            System.out.println("Giris gecersiz");
        }
        }
    }
