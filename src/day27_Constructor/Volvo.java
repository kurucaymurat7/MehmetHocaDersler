package day27_Constructor;

public class Volvo {
    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektriklimi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu();
    int maxHiz = maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model = mdl;
        elektriklimi = elk;
        yil = yl;
        yakit = ykt;
        maxHiz = maxHizAta();
        otomatikPilot = otomatikPilotSorgusu();
    }

    public int maxHizAta() {
        if (elektriklimi == true) {
            System.out.println(" max hiz : 160 ");
            maxHiz = 160;
        } else {
            System.out.println(" 240 ");
            maxHiz = 240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc = (elektriklimi==true) ? true : false;
        return sonuc;
    }

    public String toString() {
        String arabaOzellikleri = model + " " + yakit + " " + yil + " " + maxHiz + " " + otomatikPilot;
        return arabaOzellikleri;

    }

    public Volvo() {

    }

}