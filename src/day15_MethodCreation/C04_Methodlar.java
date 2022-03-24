package day15_MethodCreation;

public class C04_Methodlar {
    public static void besHarfiTersineCevir(String kelime) {
        if (kelime.length() == 5) {
            String tersKelime = kelime.substring(4) +
                    kelime.substring(3, 4) +
                    kelime.substring(2, 3) +
                    kelime.substring(1, 2) +
                    kelime.substring(0, 1);
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        }
    }

    public static void dortHarfiTersineCevir(String kelime) {
        if (kelime.length() == 4) {
            String tersKelime = kelime.substring(3) +
                    kelime.substring(2, 3) +
                    kelime.substring(1, 2) +
                    kelime.substring(0, 1);
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        }
    }

    public static void ucHarfiTersineCevir(String kelime) {
        if (kelime.length() == 3) {
            String tersKelime = kelime.substring(2) +
                    kelime.substring(1, 2) +
                    kelime.substring(0, 1);
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        }
    }
}
