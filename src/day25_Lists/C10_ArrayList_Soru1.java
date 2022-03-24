package day25_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_ArrayList_Soru1 {
    public static void main(String[] args) {
        //ArrayList metodları

        List<Character> list = new ArrayList<Character>();
        list.add('A');list.add('C');list.add('E');list.add('F');
        System.out.println(list);
        list.add('B');
        list.add(1, 'L');
        System.out.println(list);
        list.set(3, 'D');
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.contains('L'));
        System.out.println(list.contains('M'));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
