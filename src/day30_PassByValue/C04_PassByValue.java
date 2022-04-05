package day30_PassByValue;

public class C04_PassByValue {

    static double etiketfiyati;
    static double indirimyuzde;

    public static void main(String[] args) {

        etiketfiyati = 100;
        indirimyuzde = 10;
        kaliciIndirimYap();
    }

    public static void kaliciIndirimYap () {
        etiketfiyati = etiketfiyati * (100-indirimyuzde)/100;
        System.out.println("indirimli fiyat " + etiketfiyati);
    }
}
