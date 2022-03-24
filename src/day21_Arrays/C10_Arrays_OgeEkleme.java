package day21_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C10_Arrays_OgeEkleme {

    //Diziye yeni bir oge ekleme.
    //Konum ve deger belirterek diziye bir oge ekleme.

    public static void main(String[] args) {
        int[] array, yeniarray;
        array = new int[]{3, 4, 2, 6, 5, 8, 9};
        yeniarray = new int[array.length+1];

        Scanner scan = new Scanner(System.in);

        System.out.println("Girilecek deger = ");
        int yenideger = scan.nextInt();

        System.out.println("Girilecek konum = ");
        int konum = scan.nextInt();

        for (int i = 0; i <= array.length; i++) {
            if (i<konum-1) {
                yeniarray[i] =array[i];
            } if (i==konum-1) {
                yeniarray[i] = yenideger;
            } if (i>konum-1) {
                yeniarray[i]=array[i-1];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(yeniarray));

        System.out.println("İSLEM BASARİLİ...");
    }
}
