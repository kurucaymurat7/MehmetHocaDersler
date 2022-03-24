package day05_Matematiksel_Islemler;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int a = 15;
        int b = a++; //once a'yı b'ye atar, sonra a'yı bir artırır. (b=15; a=16)
        b = ++a; //once artırır, sonra b'ye atama yapar. (a=16; b=16);
        System.out.println(a); //15

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++; //once sayi2'ye atama yapılır, sonra sayi1 1 artırılır.
        System.out.println(sayi1 + " " + sayi2 + " " + " " + sayi3); //11 10 30

        sayi3=++sayi1; //once sayi1 1 artırılır, sonra sayi3'e atama yapılır.
        System.out.println(sayi1 + " " + sayi2 + " " + " " + sayi3); //12 10 12

        System.out.println(sayi3++);//12 yazdıracak, sonra sayi3 13 olacak.

        System.out.println(--sayi2); //9 (once azalt sonra yazdır)

        int x = sayi1 % 2; //2'ye bölümünden arta kalan sayıyı verir.
        if (x==1) System.out.println("tek");
        else System.out.println("çift");
    }
}
