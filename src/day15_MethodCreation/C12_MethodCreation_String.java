package day15_MethodCreation;

public class C12_MethodCreation_String {
    public static void main(String[] args) {
        //) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
        //- @ isareti icermiyorsa gecersiz email yazdirin
        //- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        //- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”

        String email = "klfmail.com11@gmail.com".toLowerCase();
        emailKontrol(email);
    }

    public static void emailKontrol(String email) {
        if (!(email.contains("@gmail.com"))) {
            System.out.println("gecersiz email");
        } else if (!(email.endsWith("@gmail.com"))) {
            System.out.println("Yazima dikkat ediniz");
        } else {
            System.out.println("email kaydedildi.");
        }
    }
}
