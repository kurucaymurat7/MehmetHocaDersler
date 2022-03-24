package day10_Switch_StringConcat;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        //Kullanıcıdan kaçıncı ay olduğunu alıp mevsimi yazdır.

        System.out.println("Ay no giriniz:");
        Scanner scan=new Scanner(System.in);
        int ayno = scan.nextInt();

        switch (ayno) {
            case 12: case 1: case 2:
                System.out.println("kış");
                break;
            case 3: case 4: case 5:
                System.out.println("ilkbahar");
                break;
            case 6: case 7: case 8:
                System.out.println("yaz");
                break;
            case 9: case 10: case 11:
                System.out.println("sonhabar");
                break;
            default:
                System.out.println("Geçersiz giriş");
                //break;
        }
    }
}