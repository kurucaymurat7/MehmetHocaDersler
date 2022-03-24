package day20_ScopeArrays;

public class C05_Objects_Variables {

    static String okulAdi = "Erdemir";
    static String sinifi = "2A";
    static String ogretmenAdi = "Belkız";
    int ogrencino;
    String ogrenciIsmi;
    char basharfi;

    public static void main(String[] args) {

        // basharfi = 'A'; // static bir class içerisinden "static olmayan" instance variable'lara direk erişim sağlanamaz.
        // ogrencino =  356; // static bir class içerisinden "static olmayan" instance variable'lara direk erişim sağlanamaz.
        // ogrenciIsmi = Ali; // static bir class içerisinden "static olmayan" instance variable'lara direk erişim sağlanamaz.

        C05_Objects_Variables ogrenci1 = new C05_Objects_Variables();
        ogrenci1.basharfi = 'A'; //static bir class içerisinden "static olmayan" instance variable'lara ancak
        ogrenci1.ogrenciIsmi = "Ali"; // bir object oluşturularak erişim sağlanabilir.
        ogrenci1.ogrencino = 245;

        ogrenci1.okulAdi = ""; //object'den sadece instance variable'lara erişim sağlanabilir.

        okulAdi = "Yildiz"; //static variable, bir kez değiştirildiğinde tamamı için değişir.

        C05_Objects_Variables ogrenci2 = new C05_Objects_Variables();
        ogrenci2.basharfi = 'B';
        ogrenci2.ogrenciIsmi = "Barış";
        ogrenci2.ogrencino = 356;
        ogrenci2.okulAdi = ""; //object'den sadece instance variable'lara erişim sağlanabilir.


    }
}
