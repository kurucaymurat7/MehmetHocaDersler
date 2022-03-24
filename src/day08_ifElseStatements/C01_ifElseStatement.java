package day08_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karakter giriniz :");
        char karakter = scan.next().charAt(0);
        String str = String.valueOf(karakter);
        str.toUpperCase();
        System.out.println(str);
        if ((karakter>='A' && karakter<'Z') || (karakter>='A' && karakter<'Z')) {
            System.out.println("Karakter");
        } else
        {
            System.out.println("Sayı");
        }
        if (Character.isLetter(karakter) == true) { // girilen kararkter sayı text ise true, int ise false
            System.out.println("harf");
        } else {
            System.out.println("sayı");
        }

    }
}
