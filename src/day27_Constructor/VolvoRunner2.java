package day27_Constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        Volvo araba1 = new Volvo("XC60",true,2023, "Benzin");
        System.out.println(araba1.toString());
        System.out.println(araba1);

        Volvo araba2 = new Volvo("FF60",false,2020, "Dizel");
        System.out.println(araba2.toString());
        System.out.println(araba2);

        Volvo araba3 = null;
        //araba3.maxHiz;

    }
}
