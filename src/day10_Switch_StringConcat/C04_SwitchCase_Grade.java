package day10_Switch_StringConcat;

import java.util.Scanner;

public class C04_SwitchCase_Grade {
    public static void main(String[] args) {

        System.out.println("Not giriniz:");
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("mükemmel");
                break;
            case 'B':
                System.out.println("çok güzel");
                break;
            case 'C':
                System.out.println("güzel");
                break;
            case 'D':
                System.out.println("geçer");
                break;
            default:
                System.out.println("Geçersiz giriş");
                //break;
        }
    }
}

