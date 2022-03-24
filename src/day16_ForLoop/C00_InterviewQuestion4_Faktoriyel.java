package day16_ForLoop;

public class C00_InterviewQuestion4_Faktoriyel {
    public static void main(String[] args) {
        //Interview Question Kullanicidan 50’den kucuk bir sayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        int sayi = 9;
        int faktoriyel = 1;
        double sonuc= faktoriyelHesapla (sayi, faktoriyel);
        System.out.println(sonuc);
    }

    public static double faktoriyelHesapla(int sayi, int faktoriyel) {
        for (int i=1; i<=sayi; i++) {
            if (i==sayi){
                System.out.print(i + "=");
            } else {
                System.out.print(i + "*");
            }
            faktoriyel=faktoriyel*i;
        }
        return faktoriyel;
    }
}
