package day09__ternary_Switch;

import java.util.Scanner;

public class C08_Switch_12Ay {
    public static void main(String[] args) {
        //Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
        System.out.println("Kaçıncı ay ?");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("Geçersiz giriş");
                break;
        }

        System.out.println("Ay adı giriniz :");
        String ay = scan.next().toLowerCase();

        switch (ay) {
            case "ocak":
                System.out.println(1);
                break;
            case "şubat":
                System.out.println(2);
                break;
            case "mart":
                System.out.println(3);
                break;
            case "nisan":
                System.out.println(4);
                break;
            case "mayıs":
                System.out.println(5);
                break;
            case "haziran":
                System.out.println(6);
                break;
            case "temmuz":
                System.out.println(7);
                break;
            case "ağustos":
                System.out.println(8);
                break;
            case "eylül":
                System.out.println(9);
                break;
            case "ekim":
                System.out.println(10);
                break;
            case "kasım":
                System.out.println(11);
                break;
            case "aralık":
                System.out.println(12);
                break;
            default:
                System.out.println("Geçersiz giriş");
                break;
        }

    }
}
