package day24_ArrayList;

import day23_MultiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
        int arr [] = {};
        //bu array'e 5 ekleyelim.
        arr = C06_Arrays.arrayeElemanEkle(arr, 5);
        System.out.println(Arrays.toString(arr));

        //bir de, 3 ekleyelim...
        arr = C06_Arrays.arrayeElemanEkle(arr, 3);
        System.out.println(Arrays.toString(arr));

        //ArrayList oluşturma işlemi...
        List <String> list1 = new ArrayList<>();
        System.out.println(list1);
        list1.add("Ali");
        System.out.println(list1);
        list1.add("Veli");
        list1.add(0, "Murat");
        System.out.println(list1);

        // yeni bir list

        List <Integer> sayilarList = new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add (5);
        sayilarList.add (3);
        System.out.println(sayilarList);
        sayilarList.add(0, 7);
        System.out.println(sayilarList);
        sayilarList.add(2, 8);
        System.out.println(sayilarList);

        System.out.println(sayilarList.get(0)); // 0.index'teki elemanı verir.

        System.out.println(sayilarList.size()); //boyutunu verir.
        System.out.println(sayilarList.isEmpty()); // true false

        sayilarList.remove(Integer.valueOf("8")); //List integer olarak girilirse, elemanı bu şekilde siliyor
        System.out.println(sayilarList);

    }
}
