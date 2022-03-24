package day18_NestedforLoop;

public class C12_WhileLoop_TekCiftSayilar {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        int sayi1= 20, sayi2= 40;
        int baslangic = (sayi1<sayi2) ? sayi1 : sayi2;
        int bitis = (sayi1>sayi2) ? sayi1 : sayi2;

        int i = baslangic;

        while (i<=bitis) {
            if (i%2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}
