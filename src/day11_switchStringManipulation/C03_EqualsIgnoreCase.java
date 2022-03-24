package day11_switchStringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {
        // Evet derse "derse katılım onaylandı"
        //Hayır derse "derse katılım onaylanmadı"

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz? \n Evet ya da Hayır");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("onaylandı");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("onaylanmadı");
        } else {
            System.out.println("Evet ya da Hayir giriniz.");
        }
    }
}