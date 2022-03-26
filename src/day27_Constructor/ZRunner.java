package day27_Constructor;

public class ZRunner {
    public static void main(String[] args) {
        Z obc1 = new Z("Emre", "Gulser", 453, true);
        System.out.println(obc1.toString());

        Z obj2 = new Z ("Emre", "DH", 55);
        System.out.println(obj2.toString());

    }
}
