package day23_MultiDimensionalArrays;

public class C09_MDArrays_AyniİndexleriTopla {
    public static void main(String[] args) {
        //Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        //elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        // (Zor soru) arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        
        int array1[][] = { {1,2, 5}, {3,4,5}, {6, 8}};
        int array2[][] = { {7,8,9}, {10,11}, {12}};
        int toplam = 0;

        System.out.println(array1.length);
        System.out.println(array2.length);

        System.out.println(array1[0].length);
        System.out.println(array2[0].length);

        for (int i = 0 ; i < array1.length && i <array2.length ; i++) {
            for (int j = 0; j < array1[i].length && j < array2[i].length; j++) {
                toplam = array1[i][j] + array2[i][j];
                System.out.println("Array1 ve Array2'nin " + i + " , "  + j + " indexleri toplamı = " + toplam);
                toplam = 0;
            }
        }
    }
}
