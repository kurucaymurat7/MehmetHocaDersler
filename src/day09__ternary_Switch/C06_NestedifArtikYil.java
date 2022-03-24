package day09__ternary_Switch;

public class C06_NestedifArtikYil {
    public static void main(String[] args) {
        //Kullanicidan artik yil olup
        //olmadigini kontrol etmek icin yil girmesini
        //isteyin.
        //Kural 1: 4 ile bolunemeyen yillar
        //artik yil degildir
        //Kural 2: 4’un kati olmasina
        //ragmen 100 ile bolunebilen yillardan
        //sadece 400’un kati olan yillar artik yildir

        int yil = 300;
        if (yil % 100 != 0) {
            if (yil % 400 == 0) {
                System.out.println("Artık yıl");
            } else {
                System.out.println("Artık yıl değil");
            }
        } else if (yil % 4 == 0) {
            System.out.println("Artık yıl");
        } else if (yil % 4 != 0){
            System.out.println("Artık yıl değil");
        }
    }
}
