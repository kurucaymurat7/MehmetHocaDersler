package day03_scanner;

import java.util.Scanner;

public class C06_Scanner_İsim_Soyisim {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen isminizi yazınız:");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi yazınız:");
        String soyisim = scan.nextLine();

        System.out.println("İsim - Soyisim :" + isim + " " + soyisim);

    }
}
