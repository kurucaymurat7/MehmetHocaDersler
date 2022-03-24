package day20_ScopeArrays;

public class C02_StaticVariables {

    /* instance variable'lar obje'ye bagimlidir ve her obje için farklı degerler alabilir
    ogrenci notları veya ogretmen maaslari gibi.

    Static variable'lar ise, class variable'lar olarak tanımlanır ve tum class uyeleri icin
    aynıdır, bir kere değişirse hepsi için değişir.
     */

    static String okulismi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulacikmi;
    String ogrenciAdi;
    String ders = "Java";

    public static void main(String[] args) {
        System.out.println(okulismi); //Yildiz Koleji
        System.out.println(okulNo); //0
        okulNo = 102;
        System.out.println(okulNo);//102
        System.out.println(okulacikmi); //false

        //System.out.println(ders); ders değişkeni static olmadığı için static bir sınıfta kullanamayız.
        staticMethod();

        System.out.println(okulNo);
    }

    public static void  staticMethod () {
        okulNo = 200;
        System.out.println(okulNo);
    }

    public void staticOlmayanMethod() {
        ogrenciAdi = "Ahmet";
        ders = "SQL";
    }

}
