package day25_Lists;

import java.util.Arrays;
import java.util.List;

public class C06_Array_to_List {
    public static void main(String[] args) {
        //array'i list'e çevir...
        String array [] = {"A", "B", "C"};
        List<String> arraydenList = Arrays.asList(array);
        //arraydenList.add("J"); //UnsupportedOperationException
        System.out.println(arraydenList); //arrayden list'e çevirir ancak bu list, birçok metodu kullanamaz.
    }
}
