package day14_stringManipulation;

import day15_MethodCreation.C04_Methodlar;

public class C03_Pratik {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim= "oguzhan";
        String soyisim="balkaya";
        String kNo="1234567890123456";

        System.out.println(isim.endsWith(""));

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println(isim + " " + soyisim);

        kNo=kNo.substring(0,11).replaceAll("\\d", "*") + kNo.substring(12);
        System.out.println(kNo);

    }
}
