package day25_Lists;

public class C11_ArrayList_ForEach {
    public static void main(String[] args) {
        int sayi = 3;
        int sum = 0;


        System.out.println(sayi /= sayi++);

        for (sayi = 3; sayi > 1; sayi /= sayi++)
            sum += sayi;

        System.out.println(sum);
    }

}
