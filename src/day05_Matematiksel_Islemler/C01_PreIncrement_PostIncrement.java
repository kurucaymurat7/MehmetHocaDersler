package day05_Matematiksel_Islemler;

public class C01_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);//11
        sayi++;
        System.out.println(sayi);//12

        System.out.println("pre increment : " + ++sayi); //once artır sonra yazdır. 13
        System.out.println("post increment : " + sayi++); //once yazdır sonra artır. 13 yazdırır, sonra sayı degerini 1 artırır.
        System.out.println(sayi);

    }
}
