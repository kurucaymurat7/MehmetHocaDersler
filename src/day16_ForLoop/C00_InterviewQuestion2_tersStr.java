package day16_ForLoop;

public class C00_InterviewQuestion2_tersStr {
    public static void main(String[] args) {
        //Interview Question Kullanicidan bir String isteyin ve Stringi tersten
        //yazdirin.

        String str = "abcdefgh";
        String tersStr = "";
        int uzunluk = str.length();

        for (int i=uzunluk; i>=1; i--){
            tersStr=tersStr+str.substring(i-1, i);
        }
        System.out.println(tersStr);
    }
}
