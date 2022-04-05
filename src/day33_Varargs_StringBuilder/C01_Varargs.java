package day33_Varargs_StringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        //En uzun kelimeyi yazdir Varargs kullanarak.
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";

        enuzunKelime (str1, str2, str3, "AhmetAli");

    }

    private static void enuzunKelime(String... str) { //Varargs uygulamasi
        String enuzunStr = "";
        for (String each:str) {
            if (each.length() >= enuzunStr.length()) {
                enuzunStr = each;
            }
        }
        System.out.println("En uzun kelime : " + enuzunStr);
    }
}
