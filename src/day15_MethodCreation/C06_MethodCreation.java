package day15_MethodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10, b=20;

        //iki sayinin degerini toplayan bir metod

        int sonuc = ikiSayiTopla(a,b);
        System.out.println(sonuc);
    }

    private static int ikiSayiTopla(int a, int b) {
        int sonuc = a + b;
        return sonuc;//return type
    }
}
