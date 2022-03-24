package day03_scanner;

import java.util.Scanner;

public class C05_Scanner_Cember_Cevre_Alan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yarıcapını giriniz");
        Double yaricap = scan.nextDouble();

        System.out.println("girdigini yaricap =" + yaricap);
        System.out.println("cemberin cevresi =" + 2*3.14*yaricap*yaricap);
        System.out.println("cemberin alani =" + 3.14*yaricap*yaricap);
    }
}
