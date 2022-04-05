package day29_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        //başka class'taki static class üyelerine ulaşabilmek icin
        // classismi. ile yazmak yeterlidir.

        System.out.println(C01_Static.okulTelefonu);
        C01_Static.okulTelefonu = "5462131646545";

        C01_Static obj = new C01_Static();
        System.out.println(obj.okulismi);

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulismi);
        obj2.okulismi = "Sabir Koleji";
        System.out.println(obj2.okulismi);//Sabir Koleji
        System.out.println(obj1.okulismi); //Yildiz Koleji
    }
}
