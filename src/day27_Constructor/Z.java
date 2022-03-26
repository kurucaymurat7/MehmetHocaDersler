package day27_Constructor;

public class Z {
    String isim, soyisim;
    int numara;
    boolean gercekmi;

    public Z(String ism, String syism, int no, boolean grc) {
        isim = ism;
        soyisim = syism;
        numara = no;
        gercekmi = grc;
    }

    public Z(String isim, String soyisim, int numara) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.numara = numara;
    }

    public String toString() {
        return (" " + isim + " " + soyisim + " " + numara + " ");
    }
}
