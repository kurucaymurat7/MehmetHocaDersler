package day33_Varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Yasasin Java");
        sb1.indexOf("Java"); // 8

        System.out.println(sb1.lastIndexOf("s"));

        System.out.println(sb1.replace(0,7, "Ne guzel"));

        System.out.println(sb1.toString().toUpperCase()); // toString() ile string ozellikleri olur.
        // (burada immutable String olarak işlem gordugu icin bir sonraki adımda
        // eskisi gibi kucuk harf olaraz yazdırır.
        System.out.println(sb1);

        System.out.println(sb1.delete(0,3));
        System.out.println(sb1.deleteCharAt(sb1.indexOf("C")));


    }
}
