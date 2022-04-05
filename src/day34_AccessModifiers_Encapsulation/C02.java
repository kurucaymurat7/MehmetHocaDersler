package day34_AccessModifiers_Encapsulation;

public class C02 {
    public static void main(String[] args) {
        // C01 obj = new C01();
        // Const default access modifier'a sahip oldugundan
        // baska package'dan kullanilamaz

        C01.halkaAcikSayi = 13;
        C01.acikSayi=5;

        C01 obj = new C01();
        obj.acikString = "Ahmet";

    }
}