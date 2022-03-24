package day18_NestedforLoop;

public class C01_MethodSifreKontrol {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        //yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        String password = "Afrd gtzz";

        boolean ilkharf = ilkharfBuyukmu(password);
        boolean sonharf = sonharfKucukmu(password);
        boolean boslukKontrol = boslukKontrolEt(password);
        boolean uzunlukKontrol = uzunlukKontrol(password);

        if (ilkharf == true && sonharf == true && boslukKontrol == true && uzunlukKontrol == true) {
            System.out.println("Sifreniz kaydedildi. Tesekkurler");
        } else {
            System.out.println("Sifre kurallarına dikkat ediniz.");
        }
    }

    public static boolean uzunlukKontrol(String password) {
        boolean uzunlukKontrolSonuc = password.length()>=8;
        return uzunlukKontrolSonuc;
    }

    public static boolean boslukKontrolEt(String password) {
        boolean boslukKontrolSonuc = !password.contains(" ");
        return boslukKontrolSonuc;
    }

    public static boolean sonharfKucukmu(String password) {
        char sonHarf = password.charAt(password.length()-1);
        boolean sonharf;
        sonharf = password.charAt(password.length()-1) >= 'a' && password.charAt(password.length()-1) <= 'z';
        return sonharf;
    }

    public static boolean ilkharfBuyukmu(String password) {
        char ilkHarf = password.charAt(0);
        boolean ilkharf;
        ilkharf = password.charAt(0) >= 'A' && password.charAt(0) <= 'Z';
        return ilkharf;
    }
}

