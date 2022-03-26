package day26_ForEach_Constructor;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb = new Araba();
        Araba arb1 = new Araba("mavi");
        Araba arb2 = new Araba("2023");
        Araba arb3 = new Araba(2023, "kırmızı");
    }
}
