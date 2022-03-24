package day05_Matematiksel_Islemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        short sayi1=20;
        Short sayi2=30; //primitive data type'leri büyük harfle başlarsa Wrapper Class olurlar.
                        //örneğin, int iken çıkmayan methodlar, INTEGER olunca çıkarlar.

        //Short Wrapper class'tır ve aynı short gibi işlemler yapılabilir.

        sayi1=sayi2;
        System.out.println(sayi1); //30
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.compare(6,5)); //x-y farkını verir.
        System.out.println(Integer.valueOf("1234".length()));
        System.out.println("1234".length());

        System.out.println(sayi2.toString());
    }
}
