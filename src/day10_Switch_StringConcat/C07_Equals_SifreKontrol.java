package day10_Switch_StringConcat;

import java.util.Scanner;

public class C07_Equals_SifreKontrol {
    public static void main(String[] args) {
        String sifre="12345";
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifre giriniz :");
        String girilen=scan.next();
        if (girilen.equals(sifre)){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Başarısız giriş");
        }
    }
}
