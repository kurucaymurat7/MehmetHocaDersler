package day34_AccessModifiers_Encapsulation;

public class C04_DenemeChild2 extends C01{
    public static void main(String[] args) {
        C01 obj = new C01(); //protected access modifier calistirdi.
        obj.sondeger = 3;
    }
}
