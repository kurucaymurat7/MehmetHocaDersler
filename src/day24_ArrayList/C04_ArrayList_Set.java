package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        isimler.set(1, "Seckin");//silinen elemanı döndürür bize. Yusuf'u döndürür.
        System.out.println(isimler);

        //daha onceden listede var olanları da arşiv gibi tutabiliriz...
        List<String> logList = new ArrayList<>();
        logList.add(isimler.set(2, "Cosmos"));//eski listi güncelledim ve yeni log listesine silineni ekledim.
        System.out.println(isimler);
        System.out.println(logList);
        logList.add(isimler.set(1, "Murat"));
        System.out.println(isimler);
        System.out.println(logList);

        System.out.println(isimler.get(0));
        System.out.println(isimler.get(2));
    }
}
