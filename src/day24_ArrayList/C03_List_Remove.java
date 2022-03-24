package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_List_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0, 7);
        sayilar.add(2, 4);

        sayilar.remove(3);//3.indexi siler.
        sayilar.add(3, 6);
        //sayilar.remove(5); //5. indexi siler.
        sayilar.remove(Integer.valueOf("5"));//5'i bulur ve siler..
        System.out.println(sayilar);


    }
}
