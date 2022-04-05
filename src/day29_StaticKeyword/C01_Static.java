package day29_StaticKeyword;

public class C01_Static {
    String okulismi = "Yildiz Koleji";
    static String okulTelefonu = "3122563215";

    public static void staticMethod () {
        System.out.println("Statik method");
    }
    public static void staticOlmayanMethod () {
        System.out.println("Static Olmayan Method");
    }
}
