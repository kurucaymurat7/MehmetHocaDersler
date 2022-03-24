package day21_Arrays;

public class C09_Arrays_OgeArama {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{3, 4, 2, 6, 5};
        int aranandeger = 0;
        boolean sonuc = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == aranandeger) {
                System.out.println(aranandeger + ", dizide " + (i+1) + ". elemandir...");
                sonuc = true;
            }
        }

        if (sonuc == false) {
            System.out.println("Aranan deger dizide bulunamadi...");
        }
    }
}
