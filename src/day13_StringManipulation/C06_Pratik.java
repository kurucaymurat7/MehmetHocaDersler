package day13_StringManipulation;

public class C06_Pratik {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        //yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        String password = "Afg34juf";
        char ilkharf = password.charAt(0);
        char sonharf = password.charAt(password.length()-1);
        boolean boslukvarmi = password.contains(" ");
        int uzunluk = password.length();

        if((ilkharf>='A' && ilkharf<='Z') && (sonharf>='a' && ilkharf<='z') && (boslukvarmi == false) && (uzunluk >= 8)) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
        }
    }
}

