package day08_ifElseStatements;

import java.util.Scanner;

public class C05_ifElse {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare
        //olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Dörtgenin kenarlarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        double kenar4= scan.nextDouble();

        if ((kenar1==kenar2) && (kenar1==kenar3) && (kenar1==kenar4)) {
            System.out.println("KARE");
        } else {
            System.out.println("KARE DEĞİL");
        }
    }
}
