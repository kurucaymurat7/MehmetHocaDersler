package day18_NestedforLoop;

public class C02_NestedforLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir rakam carpim tablosu olusturalım
        int sayi= 5;

        for (int i=1; i<= sayi; i++) {
            for (int j= 1; j<=sayi; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
