package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[] = {"Ali", "Veli", "Ayşe"};
        //array içindeki değerlere ulaşmak için index kullanırız.
        System.out.println(arr1[0]);
        arr1[1] = "Esila"; //Veli yerine Esila yazar.

        //System.out.println(arr1); //referansını yazdırır. non-primitive.
        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println(Arrays.toString(arr1));

        arr1[0] = "Murat";
        arr1[2] = "Mehmet Enes";
        System.out.println(Arrays.toString(arr1));
    }
}
