package day07_MantıkOperatorleri;

import java.util.Scanner;

public class C05_HaftaiciHaftasonu {

    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici


        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir

        // bu durumda String methodlarindan yardim aliriz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toUpperCase();// kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyorz

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiginiz gun haftasonu");
        }

        else {
            System.out.println("girdiginiz gun hafta ici");
        }
    }
}
