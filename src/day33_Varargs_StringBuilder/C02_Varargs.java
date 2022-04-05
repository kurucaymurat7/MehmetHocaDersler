package day33_Varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        // parametre olarak bir int, ve
        // istediğimiz kadar string alan
        // en uzun kelimenin harf sayisi ile int'i
        // çarp ve yazdir

        //En uzun kelimeyi yazdir Varargs kullanarak.
        int sayi = 5;
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        carp(sayi,str1, str2, str3, "AhmetAli");
        //Bir methodda varargs dısında parametre kullanacaksak, once diger parametreleri
        //yazip varargs'ı en sona yazmalıyız.
        //Bu sebeple bir methodda birden fazla varargs olamaz.
        //Bir constructor'da birden fazla this() olmaz
        //Bir class'ta birden fazla main olmaz...
    }

    private static void carp(int sayi, String... str) { //Varargs uygulamasi
        String enuzunStr = "";
        for (String each : str) {
            if (each.length() >= enuzunStr.length()) {
                enuzunStr = each;
            }
        }
        System.out.println("En uzun kelime : " + enuzunStr);
        System.out.println(sayi * enuzunStr.length());

    }
}

