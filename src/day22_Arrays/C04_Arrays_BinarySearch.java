package day22_Arrays;

import java.util.Arrays;

public class C04_Arrays_BinarySearch {

    public static void main(String[] args) {
        //verilen ögeyi bulma
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int istenensayi = 10;

        boolean sonuc = İstenenElemanVarmi(arr, istenensayi);
        System.out.println(sonuc);

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,istenensayi));
    }

    public static Boolean İstenenElemanVarmi(int[] arr, int istenensayi) {
        boolean sonuc = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenensayi) {
                sonuc = true; break;
            }
        }
        return sonuc;
    }
}

