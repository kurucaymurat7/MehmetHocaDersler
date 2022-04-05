package day33_Varargs_StringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Prize dikkat");
        sb1.insert(11, " edin");

        String str = "Hayatta cok guzel";
        System.out.println(sb1.insert(0, str, 0, 8));

        System.out.println(sb1.reverse().reverse()); // ters ters = düz

        System.out.println(sb1.substring(0,2)); // degistirmiyor
        System.out.println(sb1);

        System.out.println(sb1.subSequence(0,5)); //degistirmiyor
        System.out.println(sb1);
    }
}
