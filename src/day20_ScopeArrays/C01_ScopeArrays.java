package day20_ScopeArrays;

public class C01_ScopeArrays {

    int sayi;
    String bransismi = "Java";
    boolean okuldami;

    public static void main(String[] args) {

        //sayi =; sayi variable static olmadigi icin method'dan direk olarak kullanılamaz.
        //instance variable'lara static method'dan ulasabilmek icin object olusturmaliyiz.

        C01_ScopeArrays obj1 = new C01_ScopeArrays();
        System.out.println(obj1.sayi); //default 0 olarak deger atar.
        obj1.sayi = 5;
        System.out.println(obj1.sayi);
        System.out.println(obj1.okuldami);
        obj1.bransismi = "SQL";
        System.out.println(obj1.okuldami);

        C01_ScopeArrays obj2 = new C01_ScopeArrays();
        System.out.println(obj2.sayi);

        obj1.okuldami = true;
        System.out.println(obj2.okuldami); //false

        int sayi = 5;

    }
}
