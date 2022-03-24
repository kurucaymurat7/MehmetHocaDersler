package day04_dataCasting;

public class C02_AutoWidening {
    public static void main(String[] args) {
        boolean dogruMu=true;
        //String str=dogruMu; Bu şekilde farklı iki data tipi olduğu için çalışmaz.

        byte sayi1=44;
        System.out.println(sayi1);

        short sayi2=sayi1; //solu short, sagı ise byte (byte - short'dan küçük oldugu için itiraz etmiyor)
        System.out.println(sayi2);

        double sayi3=sayi2; //double, short'tan daha büyük olduğu için hata vermez
        System.out.println(sayi3);
    }
}
