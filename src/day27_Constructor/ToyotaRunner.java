package day27_Constructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1 = new Toyota();
        System.out.println(t1.marka);
        System.out.println(t1.tekeradedi);
        System.out.println(t1.motoruvarmi);
        System.out.println(t1.model); // null. instance variable default atama yapar.
        System.out.println(t1.yakit); //null
        System.out.println(t1.yil); //0
        t1.model = "Corolla";
        t1.yakit = "Benzin";
        t1.yil = 2023;
        System.out.println(t1.model);
        System.out.println(t1.yakit);
        System.out.println(t1.yil);
        t1.maxHiz();

        Toyota t2 = new Toyota();
        t2.yakit = "Dizel";
        t2.model = "Yaris";
        t2.yil = 2020;
        t2.maxHiz();
        t2.renkTercihleri();
    }
}
