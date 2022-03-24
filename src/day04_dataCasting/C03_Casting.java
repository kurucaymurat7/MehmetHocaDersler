package day04_dataCasting;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);

        sayi1=4786;
        sayi2=10;

        System.out.println(sayi1/sayi2);

        sayi1=4895;
        double sayi3=10;
        //sayi1=sayi1/sayi3; //iki farklı sayı data türünü işleme koyduğumuzda, küçük olan data için
                            //Auto widening yapar.
        System.out.println(sayi1/sayi3);

    }
}
