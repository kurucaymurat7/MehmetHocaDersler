package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz = ");
        double not = scan.nextDouble();

        if (not<0 || not >100) {
            System.out.println("Geçerli not giriniz");
        } else if (not < 50) {
                System.out.println("D");
            } else if (not < 60) {
                System.out.println("C");
            } else if (not < 80) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
}
