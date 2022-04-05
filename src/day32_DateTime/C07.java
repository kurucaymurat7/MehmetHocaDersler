package day32_DateTime;

import java.time.Period;
import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //        INPUT:
        //        Dakika sayısı: 3456789
        //        OUTPUT :
        //        3456789 dakika yaklaşık 6 yıl 210 gündür

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir dakika bilgisi giriniz : "); // 3456789
        int dakika = scan.nextInt();
        yilvegunsayisiniBul (dakika);

    }

    private static void yilvegunsayisiniBul(int dakika) {
        int gun = dakika / (24*60);
        System.out.println(gun);
        int yil = gun / 365;
        gun = gun % 365;
        System.out.println(yil + " yil " + gun + " gundur. ");
    }
}
