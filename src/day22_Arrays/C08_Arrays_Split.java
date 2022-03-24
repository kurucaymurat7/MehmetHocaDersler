package day22_Arrays;

import java.util.Arrays;

public class C08_Arrays_Split {
    public static void main(String[] args) {
        String cumle = "Nerede o eski gunler";
        String harf="e";
        int adet = 0;

        String [] harfler = cumle.split("");
        System.out.println(Arrays.toString(harfler));

        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].equals("e")) {
                adet++;
            }
        }
        System.out.println("e harfi " + adet + " defa kullanılmış...");
    }
}
