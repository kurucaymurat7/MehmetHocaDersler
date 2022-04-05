package day36_Inheritance;

public class UstaBasi extends Isci {
    public static void main(String[] args) {
        UstaBasi ustabasi1 = new UstaBasi();
        ustabasi1.saatucreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Kurucay";
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="UstaBasi";
        System.out.println(ustabasi1);

    }

    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatucreti=" + saatucreti +
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
