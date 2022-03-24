package day21_Arrays;

public class C01_ArraysDeclaration {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5}; //index degerleri 0'dan baslar.
        int arr2[] = {2, 4, 6};
        int [] arr3 = {0, 1, 2};

        double arr4[] = {10.2, 20.1, 5};

        String arr5[] = {"Ali", "Veli", "Ahmet"};

        System.out.println(arr1[0] + arr2[1] + arr5[2]);

        int arr6[] = new int[5]; //5 elemanlı bir array oluştur. integer.
        arr6[0] = 5;
        System.out.println(arr6[0]);

    }
}
