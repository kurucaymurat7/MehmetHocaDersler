package day30_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        double etiketfiyati = 100;
        double indirimyuzde = 10;
        etiketfiyati = kaliciIndirimYap(etiketfiyati, indirimyuzde);
    }

    public static double kaliciIndirimYap (double etiketfiyati, double indirimyuzde) {
        etiketfiyati = etiketfiyati * (100-indirimyuzde)/100;
        System.out.println("indirimli fiyat " + etiketfiyati);
        return etiketfiyati;
    }
}
