package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String isim = "mavi";
        System.out.println();

        String tersstr = isim.substring(3)+
                isim.substring(2,3)+
                isim.substring(1,2)+
                isim.substring(0,1);
        System.out.println(tersstr);

        // for ile.

        //Bir string’i ters çeviren uygulama yaz.
        String str = "mavi";
        int uzunluk1 = str.length();
        String yenikelime ="";
        for (int i=uzunluk1; i>0;i--) {
            yenikelime = yenikelime.concat(""+str.charAt(i-1));
        }
        System.out.println(str);
        System.out.println(yenikelime);
    }
}
