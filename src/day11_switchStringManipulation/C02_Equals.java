package day11_switchStringManipulation;

public class C02_Equals {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali" + "Can";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = str1 + "";
        //equals for string
        //== for numbers

        String str5 = "hasan";
        String str6 = "HASAN";
        System.out.println(str5.equals(str6));//false
        System.out.println(str5.toUpperCase().equals(str6));

        System.out.println(str5.equalsIgnoreCase(str6));

    }
}
