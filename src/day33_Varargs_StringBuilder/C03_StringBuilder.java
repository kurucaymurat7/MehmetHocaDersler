package day33_Varargs_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10); //capacity

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16. Alabilecegi karakter adedi

        System.out.println(sb2.length()); //14
        System.out.println(sb2.capacity()); //30

        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity()); //10

        //append ile ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append(" guzel");
        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("tum dersler Java olsa");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.trimToSize(); //fazlalıgı atıyor

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


    }
}
