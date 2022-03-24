package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2); //Sonuc double'dır ama variable integer. Variable daha dar.
                                        //Java bunu kabul etmez otomatik olarak, sorumluluğu üstlenmeni ister.
        System.out.println(sayi4);

        int sayi5=140;
        sayi5+=3;//Değeri 3 artırır.
        byte sayi6= (byte) sayi5; // kabul etmez int, byte'dan daha büyüktür.
        System.out.println(sayi6); //byte -128 ile 127 arasında değer aldığı için 0'dan + veya - yönünde
                                    //hareket ederek değeri atar.
    }
}
