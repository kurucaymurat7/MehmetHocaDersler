package day09__ternary_Switch;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        // Ternary kompleks olmayan işlemlerde kullanılır.
        // Tam sayının tek mi çift mi yazdır.
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi girin :");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("çift");
        } else {
            System.out.println("tek");
        }
        System.out.println(sayi%2==0?"çift":"tek");

        //SWITCH CASE...
        switch (sayi%10) {
            case 0:
                System.out.println("SONU 0");
                break;
            case 5:
                System.out.println("SONU 5");
                break;
            default:
                System.out.println("DİĞER");
                break;
        }
    }
}
