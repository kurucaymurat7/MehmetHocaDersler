package day03_scanner;

import java.util.Scanner;

public class C09_Pisagor_Denklemi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Kısa kenarı giriniz :");
        int kisakenar= scan.nextInt();

        System.out.println("Uzun kenarı giriniz :");
        int uzunkenar= scan.nextInt();

        System.out.println("Dik kenarın uzunluğu =" + Math.sqrt((kisakenar*kisakenar)+(uzunkenar*uzunkenar)));

       // C08_Scanner_İsimBasHarf.main(); aynı package içindeki farklı class'ı çalıştırıyor.

        //if (uzunkenar>kisakenar){
        //    System.out.println("uzunkenar>kısakenar");
        //}
        //else{
        //   System.out.println("kısakenar>uzunkenar");
        //}
    }
}
