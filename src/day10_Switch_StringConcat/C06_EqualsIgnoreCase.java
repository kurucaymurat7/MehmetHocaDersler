package day10_Switch_StringConcat;

public class C06_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali can";
        String str3=null;

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(str1.length()+""+str2.length());
        //System.out.println(str3.length()); //hata veriyor, null hiçliktir.
    }
}
