package day23_MultiDimensionalArrays;

public class C02_MD_Arrays {
    public static void main(String[] args) {
        //toplamı bulun.
        
        int[][] array = {{3, 1, 7}, {6, 10, 2}, {1, 2, 3}};

        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toplam += array[i][j];
            }
        }
        System.out.println(toplam);
    }
}
