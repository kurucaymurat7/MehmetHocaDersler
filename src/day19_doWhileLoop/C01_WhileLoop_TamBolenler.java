package day19_doWhileLoop;

public class C01_WhileLoop_TamBolenler {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin

        int sayi = 30;
        int tambolensayisi = 0;
        tambolensayisi = SayininTamBolenleriniBul(sayi);
        System.out.println();
        System.out.print("Tam bolen sayisi = " + tambolensayisi);
    }

    public static int SayininTamBolenleriniBul(int sayi) {
        int i=1;
        int tambolensayisi = 0;
        while (i <= sayi) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                tambolensayisi++;
            }
            i++;
        }
        return tambolensayisi;
    }

}

