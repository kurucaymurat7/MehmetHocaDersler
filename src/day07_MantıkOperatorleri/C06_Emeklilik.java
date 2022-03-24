package day07_MantıkOperatorleri;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanıcı yasi 65 ve üstü ise emekli, altı ise degil
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz?");
        int yas = scan.nextInt();

        if (yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsın");
            System.out.println(65-yas + "yıl çalışmalısın");
        }
    }
}
