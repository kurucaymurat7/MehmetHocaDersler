package day11_switchStringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('J'));//0
        System.out.println(str1.indexOf("aska"));//10
        System.out.println(str1.length()-1);//35
        System.out.println(str1.indexOf('a'));//5. ilk eşleşmenin indexi.
        System.out.println(str1.indexOf("a", 4));//4.index'ten sonra ilk eşleşmeyi bulana dek gidiyor
        System.out.println(str1.indexOf('b',6));//9

        int ilkaHarfiIndex = str1.indexOf('a');
        int ikinciaHarfIndex = str1.indexOf('a', ilkaHarfiIndex+1);
        System.out.println(ikinciaHarfIndex);

        System.out.println(str1.indexOf("guzel", 20));

        System.out.println(str1.indexOf('y')); //olmayan harfi aratma. -1

        //kullanıcından mail adresini isteyin @ işareti yoksa geçersiz varsa geçerli yazdır.
        String mail = "aaassdd@fdg.om";
        if (mail.indexOf('@')==-1){
            System.out.println("geçersiz");
        } else {
            System.out.println("geçerli");
        }
    }
}
