package day07_MantıkOperatorleri;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        System.out.println("SAYI =");
        Scanner scan=new Scanner(System.in);
        int sayi = scan.nextInt();
        
        
        if (sayi % 2 == 1 ) {
            System.out.println("tek");
        }
        if (sayi % 2 ==0) {
            System.out.println("çift");
        }

        if (sayi % 2 == 0) {
            System.out.println("çift");
        } else {
            System.out.println("tek");
        }
    }
    
    
}
