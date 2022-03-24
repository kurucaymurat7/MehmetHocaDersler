package day07_MantıkOperatorleri;

public class C08_AsalSayi {
    public static void main(String[] args) {
        //Girilen sayının asal olup olmadıgını bul.

        int sayi=2;
        int bolum=1;

        for (int i=2; i<sayi; i++) {
            if (sayi%i==0){
                System.out.println("x");
            }
        }
        System.out.println(bolum);

        if (bolum==1){
            System.out.println("Asal");
        } else {
            System.out.println("Asal degil");
        }
    }
}
