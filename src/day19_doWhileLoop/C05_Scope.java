package day19_doWhileLoop;

public class C05_Scope {
    //1-Bir method icerisnde olusturulan variable'lar sadece olusturulduklari method'da kullanılabilirler
    //baska method'larda kullanilamazlar
    //2-Tum method'larin kullanabilmesini istedigimiz variable'lari
    //Class level'da olustururuz
    //Class level'da olusturdugumuz variable'i static yaparsak tum methodlar kullanabilir
    //static olmazsa(instance) o zaman static olmayanlar calisabilir
    //3-Loop icinde olusturulan variable'lar loop'un icinde kullanilabilir
    //ama Loop'un disinda kullanamzsiniz

    static String kurs="Java";
    int level=10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi=10;
        // isim="vali yan";

        System.out.println(kurs);
        //System.out.println(level); //kabul etmez

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
        // System.out.println(i);
        // loopSayi=30; //3.madde

        int sayi2;
        //sayi2++; main method içinde oluşturup deger atamadıgım sayıyı artırmama izin vermiyor.
        sayi4++; // class seviyesinde tanımladıgımız degiskene artırım yapıyor.
        System.out.println(sayi4);
    }

    public static void method1(){
        //sayi=20;
        String isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level);
    }
    public void method2(){
        //  sayi=15;
        //  isim="suleyman";
        System.out.println(kurs);
        System.out.println(level);//itiraz etmez
    }
}