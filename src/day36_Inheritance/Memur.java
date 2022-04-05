package day36_Inheritance;

public class Memur extends Muhasebe {

    public static void main(String[] args) {

        Memur memur1 = new Memur();
        //Personelden.
        memur1.isim = "Ahmet";
        memur1.soyisim = "Tepecik";
        memur1.adres = "Ankara";
        memur1.tel = "3125756595";

        //Muhasebeden.
        memur1.saatucreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="memur";
        System.out.println(memur1);

        Memur memur2 = new Memur();
        memur2.persNo=1002;
        memur2.saatucreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);
    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
