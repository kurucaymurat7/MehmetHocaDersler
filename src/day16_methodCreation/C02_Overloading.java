package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {

        //OVERLOADING...

        //verilen iki integer toplayan method.
        int sayi1 = 10, sayi2 = 20;
        toplaYazdir(sayi1, sayi2);

        //iki double topla
        double sayi3 = 10.0, sayi4=20.0;
        toplaYazdir(sayi3, sayi4);

        //Bir int bir double
        int sayi5 = 3;
        double sayi6 = 3.2;
        toplaYazdir(sayi5, sayi6);

        //Bir double bir int girdik.
        //Bu sefer double'a cast yapacagı methodu calistirdi.
        double sayi7 = 3.0;
        int sayi8 = 1;
        toplaYazdir(sayi7, sayi8);
    }

    private static void toplaYazdir(int sayi5, double sayi6) {
        System.out.println("bir int bir double = " + (sayi5 + sayi6));
    }
    private static void toplaYazdir(double sayi3, double sayi4) {
        System.out.println("double + double = " + (sayi3 + sayi4));
    }
    private static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("int + int = " + (sayi1 + sayi2));
    }

}
