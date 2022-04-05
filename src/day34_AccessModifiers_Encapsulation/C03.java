package day34_AccessModifiers_Encapsulation;

public class C03 {
    public static void main(String[] args) {
        // C01 obj = new C01();
        // Const default access modifier'a sahip oldugundan
        // baska package'dan kullanilamaz

        C01 Obj = new C01();
        C01.halkaAcikSayi=13;

    }
}
