package day18_NestedforLoop;

public class C04_NestedforLoop {
    public static void main(String[] args) {
        //*
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        int sayi = 5;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= sayi-1; i++) {
            for (int j = 1; j <= sayi-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
