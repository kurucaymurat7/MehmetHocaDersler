package day16_ForLoop;

public class C00_InterviewQuestion3 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
        //tamsayilari toplayip, sonucu yazdiran bir program yaziniz.

        int sayi1=2, sayi2=5;
        int toplam = 0;
        int kucuksayi = (sayi1>sayi2)?sayi2:sayi1;
        int buyuksayi = (sayi1>sayi2)?sayi1:sayi2;

        for (int i=kucuksayi; i<=buyuksayi; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);
    }
}
