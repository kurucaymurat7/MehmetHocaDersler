package day32_DateTime;

public class C06_VarArgs {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplaGel();
        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2, sayi3);
        toplaGel(sayi1, sayi2, sayi3, sayi4, sayi5);

        String s1 = "a";
        String s2 = "b";
        String s3 = "c";

        ekleGel(s1,s2);
        ekleGel(s1,s2,s3);
    }

    private static void ekleGel(String... s) {
        String sonuc = "";
        for (String each:s) {
            sonuc += each;
        }
        System.out.println(sonuc);
    }

    private static void toplaGel(int... sayi) {
        int toplam = 0;
        for (int each:sayi) {
            toplam += each;
        }
        System.out.println(toplam);
    }
    //private static void toplaGel(int sayi1, int sayi2, int sayi3) {
    //    System.out.println(sayi1+sayi2);
    //}
}
