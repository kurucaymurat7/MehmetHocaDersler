package day09__ternary_Switch;

public class C04_Ternary {
    public static void main(String[] args) {
        // verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // pozitif sayi ise tek veya cift
        // negatif sayi ise -100 den buyuk veya kucuk
        // olduunu belirleyen bir ternary yaziniz.
        int sayi = 25;
        if (sayi >= 0) {
            if (sayi % 2 == 0){
                System.out.println("çift sayı");
            } else {
                System.out.println("tek sayı");
            }
        } else {
            if (sayi<=-100) {
                System.out.println("sayı -100'den kucuk veya eşit");
            } else {
                System.out.println("sayı -100'den buyuk");
            }
        }

        String sonuc = sayi >=0 ?
                (sayi % 2 == 0 ? "çift sayı" : "tek sayı") :
                (sayi <= -100 ? "-100'den kucuk" : "-100'den buyuk");
        System.out.println(sonuc);
    }
}
