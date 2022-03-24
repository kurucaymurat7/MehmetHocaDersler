package day15_MethodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        String str = "Ali";
        //hosgeldiniz metodu oluştur
        hosgeldinYazdir();
    }

    public static void kapanmaMetodu() {
        System.out.println("Teşekkürler");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hoş geldin");
        stringYazdir("Ali");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMetodu();
    }
}
