package day34_AccessModifiers_Encapsulation;

class C05_GetterSetter {
    // encapsule edecegimiz 2 variable olusturalim

    private int sayi;
    private String str;
    private String yeniStr;

    public String getYeniStr() {
        return yeniStr;
    }

    @Override
    public String toString() {
        return "C05_GetterSetter{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                ", yeniStr='" + yeniStr + '\'' +
                '}';
    }

    public void setYeniStr(String yeniStr) {
        this.yeniStr = yeniStr;
    }

    public int getSayi() {
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
