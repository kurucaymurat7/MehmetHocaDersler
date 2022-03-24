package day23_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullanicidan kaç elementlik bir array oluşturacagini sorun,
        //arrayi oluşturup elementleri kullanıcıdan alıp array'e atayın.

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen kaç elementli bir array");
        int uzunluk = scan.nextInt(); //5

        int array[] = new int[uzunluk];//0 0 0 0 0 ....
        for (int i = 0; i < uzunluk; i++) {
            System.out.println((i+1) + ". eleman : ");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
