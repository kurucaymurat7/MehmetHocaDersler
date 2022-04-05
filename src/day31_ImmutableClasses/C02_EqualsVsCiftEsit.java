package day31_ImmutableClasses;

public class C02_EqualsVsCiftEsit {

    public static void main(String[] args) {

        //İslem yaparak geldik a'da
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals ("2cfalse")){
            System.out.println("equals");
        }

        //En basit halde atama yaptık, string havuzunda arayarak degeri belirledi.
        String b = "2cfalse";

        if (b == "2cfalse") {
            System.out.println("==");
        }
        if (b.equals ("2cfalse")){
            System.out.println("equals");
        }

    }
}
