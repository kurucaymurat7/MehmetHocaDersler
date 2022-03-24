package day17_forLoops;

import org.w3c.dom.ls.LSOutput;

public class C04_forLoop {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        //palindrome olup olmadigini kontrol eden bir program yazin.

        String str = "merve";
        String tersStr = "";

        for (int i=1; i<=str.length(); i++){
            tersStr=tersStr+str.substring(str.length()-i, str.length()-i+1);
        }
        String sonuc = (str.equalsIgnoreCase(tersStr))?"palindrome":"palindrome değil";
        System.out.println(sonuc);
    }
}
