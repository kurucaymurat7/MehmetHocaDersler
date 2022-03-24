package day13_StringManipulation;

public class C04_Contains {
    public static void main(String[] args) {

        //Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
        //cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf
        //olarak yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi
        //icermiyor” yazdirin

        String cumle = "Kucuk gun yarin";
        if (cumle.contains("buyuk") || cumle.contains("Buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk") || cumle.contains("Kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
