package day26_ForEach_Constructor;

public class Araba {
    /* Javada her Class olustugunda Java o Class'tan objeler üretmek gerekebilir diye
    otomatik olarak her Class'a bir constructor koyar.

    Java class olustururken class'a koydugu constructor'a default constructor denir

    Gorunur bir constructor olsun istersek, default constructor ile ayni gorevi yapan
    bir constructor da olusturabiliriz.
    Veya, istersek aynı kalıptan farklı desenlerde objeler olusturmak icin farklı ozelliklerde
    constructorlar da olusturabiliriz.

    constructor'lari birbirinden farklı kılan tek ozellik kullanilan parametre sayisi ve
    data turudur.
     */

    public Araba() { // gorunur modifier
        //constructor ismi Class ismi ile aynı olmalıdır.
        //return type olmaz.
        System.out.println("paratmetresiz constructor ");
    }

    public Araba (String renk) {
        System.out.println(renk + " renkli araba üretildi. ");
    }

    public Araba (int yil) {
        System.out.println(yil + " model araba üretildi. ");
    }

    public Araba (int yil, String renk) {
        System.out.println(renk + yil +" model araba üretildi. ");
    }

}
