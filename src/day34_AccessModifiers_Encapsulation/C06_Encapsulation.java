package day34_AccessModifiers_Encapsulation;

import java.util.Scanner;

public class C06_Encapsulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        C06_GetterSetter memur = new C06_GetterSetter();

        System.out.println("Kullanici username : ");
        memur.setUsername(scan.next());
        System.out.println("TCK No : ");
        memur.setTCKNo(scan.nextLong());

        C06_GetterSetter amir = new C06_GetterSetter();
        System.out.println("User name : ");
        System.out.println(amir.getUsername());
        System.out.println("TCK No : ");
        System.out.println(amir.getTCKNo());

    }
}
