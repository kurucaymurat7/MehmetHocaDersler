package day18_NestedforLoop;

public class C13_ForLoopWhileLoop_ilksonharf {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.

        char harf1 = 'i', harf2 = 'a';
        char baslangic = (harf1 < harf2) ? harf1 : harf2;
        char bitis = (harf1 > harf2) ? harf1 : harf2;
        char i = baslangic;
        while (i <= bitis) {
            System.out.println(Character.valueOf(i).toString().toUpperCase() + "");
            i++;
        }

        int harf1int = Character.valueOf(harf1); //ASCII degerini bulur.
        int harf2int = Character.valueOf(harf2); //ASCII degerini bulur.
        int ilkharfASCII = (harf1int < harf2int) ? harf1int : harf2int; // Ternary operatoru. İlk harfi bulur.
        int sonharfASCII = (harf1int > harf2int) ? harf1int : harf2int; // Ternary operatoru. Son harfi bulur.
        int sayac = ilkharfASCII;

        AradakiHarfleriBuyukYazdir(ilkharfASCII, sonharfASCII); //Method olarak cagiriyoruz.
    }

    public static void AradakiHarfleriBuyukYazdir(int ilkharfASCII, int sonharfASCII) {
        int sayac = ilkharfASCII;
        while (sayac <= sonharfASCII) {
            System.out.println(Character.toString(sayac).toUpperCase());
            sayac++;
        }
    }
}
