package day10_Switch_StringConcat;

public class C05_for_String_TersCevir {
    public static void main(String[] args) {

        //Bir string’i ters çeviren uygulama yaz.
        String str = "abcdefgh";
        int uzunluk1 = str.length();
        String yenikelime ="";
        for (int i=uzunluk1; i>0;i--) {
            yenikelime = yenikelime.concat(""+str.charAt(i-1));
        }
        System.out.println(str);
        System.out.println(yenikelime);

        //Bir Sayıyı ters çeviren bir uygulama yaz
        int sayi = 12345678;
        System.out.println(sayi);
        String str1 = String.valueOf(sayi);
        int uzunluk2 = str1.length();
        String yenideger ="";
        for (int i=uzunluk2; i>0;i--) {
            yenideger = yenideger.concat(""+str1.charAt(i-1));
        }
        sayi = Integer.valueOf(yenideger);
        System.out.println(sayi);
    }
}
