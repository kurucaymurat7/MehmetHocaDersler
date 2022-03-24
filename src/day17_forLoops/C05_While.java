package day17_forLoops;

public class C05_While {
    public static void main(String[] args) {
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int sayi1=3;
        int sayi2=13;
        int kucuksayi=(sayi1<sayi2)?sayi1:sayi2;
        int buyuksayi=(sayi1>sayi2)?sayi1:sayi2;
        int i = kucuksayi;
        while (i<= buyuksayi) {
            if (i%2 == 1){
                System.out.println(i);
            }
            i++;
        }
    }
}
