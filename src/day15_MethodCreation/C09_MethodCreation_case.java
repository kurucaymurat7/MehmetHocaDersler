package day15_MethodCreation;

import java.util.Scanner;

public class C09_MethodCreation_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayisi = kelime.length();

        switch (harfSayisi) {

            case 0: case 1: case 2: {
                System.out.println("Kelime kısa");
                break;
            }
            case 3: {
                C04_Methodlar.ucHarfiTersineCevir(kelime);
                break;
            }
            case 4: {
                C04_Methodlar.dortHarfiTersineCevir(kelime);
                break;
            }
            case 5: {
                C04_Methodlar.besHarfiTersineCevir(kelime);
                break;
            }
            default: {
                System.out.println("kelime uzun");
            }
        }
    }
}
