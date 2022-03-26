package day27_Constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo araba1 = new Volvo();
        System.out.println(araba1.marka);
        araba1.yakit = "Dizel";
        araba1.model = "Volvo EC30";
        araba1.yil = 2023;
        araba1.elektriklimi = true;
        System.out.println(araba1.maxHiz);
        System.out.println(araba1.otomatikPilotSorgusu());
        System.out.println(araba1.toString());

        Volvo araba2 = new Volvo();
        araba2.yakit = "Elektrikli";
        araba2.elektriklimi = true;
        araba2.model = "XC90";
        System.out.println(araba2.toString());
    }
}
