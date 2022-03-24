package day15_MethodCreation;

public class C10_MethodCreation {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin. Bu sayi sifirdan buyukse, sayinin basamak
        //sayisini, tek mi cift mi oldugunu ve 100’den buyukse birler,onlar ve yuzler
        //basamagindaki rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini
        //yazdirin.

        int sayi=400;
        if (sayi>0 && sayi<100) {
            System.out.println("Sayi 100'den kucuk");
            tekmiCiftmi(sayi);
            System.out.println("Birler basamagi = " + (sayi%10));
        } else if (sayi>=100) {
            System.out.println("Sayi 100'den buyuk");
            basamaklarToplaminiYaz(sayi);
        } else {
            System.out.println("Geçersiz bir giriş");
        }
    }

    public static void basamaklarToplaminiYaz(int sayi) {
        //System.out.println(sayi%10);//birler
        //System.out.println(sayi/10%10);//onlar
        //System.out.println(sayi/100);//yuzler
        System.out.println("Sayilar toplamı = " + (sayi%10 + sayi/10%10 + sayi/100));
        return;
    }

    public static void tekmiCiftmi(int sayi) {
        if (sayi%2==0){
            System.out.println("çift sayi");
        } else {
            System.out.println("tek sayi");
        }
    }
}