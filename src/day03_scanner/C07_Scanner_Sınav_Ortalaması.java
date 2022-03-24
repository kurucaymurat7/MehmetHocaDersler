package day03_scanner;

import java.util.Scanner;

public class C07_Scanner_Sınav_Ortalaması {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vizenotu, finalnotu;

        System.out.println("Vize notunuzu giriniz : ");
        vizenotu=scan.nextInt();

        System.out.println("Final notunuzu giriniz :");
        finalnotu=scan.nextInt();

        System.out.println("Sınav ortalaması : " + (vizenotu*0.4+finalnotu*0.6));
    }
}
