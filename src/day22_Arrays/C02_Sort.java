package day22_Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int enkucuk = Integer.MAX_VALUE; // arr[0] herhangi bir dizi elemanı da olabilir.
        int enbuyuk = Integer.MIN_VALUE; // arr[0] herhangi bir dizi elemanı da olabilir.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < enkucuk) {
                enkucuk = arr[i];
            }
        }
        System.out.println(enkucuk);
    }
}
