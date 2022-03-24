package day10_Switch_StringConcat;

public class C08_forMukemmelSayi {
    public static void main(String[] args) {
        //Bir sayının Mükemmel bir sayı olup olmadığını bulan metod yaz.
        //Mükemmel sayı,sayılarteorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olansayı.
        //Diğer bir ifadeyle, birmükemmel sayı, bütün pozitif tam bölenlerinin toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.

        int sayi = 28;
        int bolentertoplam= 0;

        for (int i=1; i<sayi; i++) {
            if (sayi%i == 0) {
                bolentertoplam = bolentertoplam + i;
                System.out.println(i);
            }
        }
        if (bolentertoplam == sayi) {
            System.out.println("Mukemmel Sayı");
        } else {
            System.out.println("Mukemmel Sayı Değil");
        }
    }
}
