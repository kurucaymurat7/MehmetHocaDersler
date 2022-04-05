package day30_PassByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        double etiketFiyati = 100;
        yuzdeonindirimYap(etiketFiyati);
        yuzdeonindirimYap(etiketFiyati);
        System.out.println("Etiket fiyati = " + etiketFiyati);
    }

    public static void yuzdeonindirimYap(double etiketFiyati) {
        etiketFiyati = etiketFiyati*0.90;
        System.out.println("Yuzde 10 indirim yapildi." + etiketFiyati);
    }
}
