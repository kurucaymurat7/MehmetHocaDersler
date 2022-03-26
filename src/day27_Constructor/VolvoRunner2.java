package day27_Constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        Volvo araba1 = new Volvo("XC60",false,2023, "Benzin");
        System.out.println(araba1.toString());
        System.out.println(araba1);
    }
}
