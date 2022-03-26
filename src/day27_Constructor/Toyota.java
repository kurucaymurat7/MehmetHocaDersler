package day27_Constructor;

public class Toyota {
    String marka = "Toyota"; //her araba icin ayni
    int tekeradedi = 4;//her araba icin ayni
    boolean motoruvarmi = true;//her araba icin ayni
    String model;// degisken
    String yakit;// degisken
    int yil;

    public void maxHiz () { //method
        if (yakit.equalsIgnoreCase("Benzin")) {
            System.out.println("Benzinli arabalar hız max 240 km.");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel arabalar hız max 260 km");
        }
    }

    public void renkTercihleri () {
        if (model.equalsIgnoreCase("Corolla")) {
            System.out.println("Corolla renk secenekleri KIRMIZI ve BEYAZ.");
        } else if (model.equalsIgnoreCase("Yaris")) {
            System.out.println("Yaris icin renk secenekleri SARI ve LACİVERT.");
        }
    }
}
