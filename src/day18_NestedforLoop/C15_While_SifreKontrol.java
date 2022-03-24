package day18_NestedforLoop;

public class C15_While_SifreKontrol {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        //yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        String password = "Afrd gZ";

        boolean ilkharf = ilkharfBuyukmu(password);
        boolean sonharf = sonharfKucukmu(password);
        boolean boslukKontrol = boslukKontrolEt(password);
        boolean uzunlukKontrol = uzunlukKontrol(password);

        while (ilkharf == false || sonharf == false || boslukKontrol == false || uzunlukKontrol == false) {
            System.out.println("Sifre yazim kurallarina dikkat etmelisiniz...");
            int hatasayisi = 0;
            if (ilkharf == false) {
                hatasayisi++;
                System.out.print(hatasayisi + ".hata: ");
                System.out.println("ilk harf buyuk olmalidir.");
            }
            if (sonharf == false) {
                hatasayisi++;
                System.out.print(hatasayisi + ".hata: ");
                System.out.println("son harf kucuk olmalidir.");
            }
            if (boslukKontrol == false) {
                hatasayisi++;
                System.out.print(hatasayisi + ".hata: ");
                System.out.println("bosluk icermemelidir.");
            }
            if (uzunlukKontrol == false) {
                hatasayisi++;
                System.out.print(hatasayisi + ".hata: ");
                System.out.println("8 karakter ya da daha fazla olmalidir.");
            }
            break;
        }
        if (ilkharf == true && sonharf == true && boslukKontrol == true && uzunlukKontrol == true) {
            System.out.println("Sifreniz kaydedildi. Tesekkurler");
        }
    }

    public static boolean uzunlukKontrol(String password) {
        boolean uzunlukKontrolSonuc = password.length() >= 8;
        return uzunlukKontrolSonuc;
    }

    public static boolean boslukKontrolEt(String password) {
        boolean boslukKontrolSonuc = !password.contains(" ");
        return boslukKontrolSonuc;
    }

    public static boolean sonharfKucukmu(String password) {
        char sonHarf = password.charAt(password.length() - 1);
        boolean sonharf;
        sonharf = password.charAt(password.length() - 1) >= 'a' && password.charAt(password.length() - 1) <= 'z';
        return sonharf;
    }

    public static boolean ilkharfBuyukmu(String password) {
        char ilkHarf = password.charAt(0);
        boolean ilkharf;
        ilkharf = password.charAt(0) >= 'A' && password.charAt(0) <= 'Z';
        return ilkharf;
    }
}


