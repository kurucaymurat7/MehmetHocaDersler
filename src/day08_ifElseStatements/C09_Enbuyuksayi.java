package day08_ifElseStatements;

public class C09_Enbuyuksayi {
    public static void main(String[] args) {
        //En büyük sayıyı bul.
        int sayi1=17, sayi2=10, sayi3=8;
        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println(sayi1);
        }
        if (sayi2>sayi1 && sayi2>sayi3){
            System.out.println(sayi2);
        }
        if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println(sayi2);
        }

        //Bu şekilde daha mantıklı.
        int enbuyuk=sayi1;
        if (enbuyuk<sayi2){
            enbuyuk=sayi2;
        }
        if (enbuyuk<sayi3){
            enbuyuk=sayi3;
        }
        System.out.println(enbuyuk);
    }
}
