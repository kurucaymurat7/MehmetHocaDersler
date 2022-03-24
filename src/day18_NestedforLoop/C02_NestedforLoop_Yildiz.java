package day18_NestedforLoop;

public class C02_NestedforLoop_Yildiz {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        int sayi = 5;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
