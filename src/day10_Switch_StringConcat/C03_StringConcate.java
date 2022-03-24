package day10_Switch_StringConcat;

public class C03_StringConcate {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candır";

        System.out.println(str1 + " " +str2);

        String cumle = str1.concat(str2);
        System.out.println(cumle); //boşluk yok

        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle); //boşluk var

        //concat içine sadece string data ister.
        System.out.println(str1.concat(" 11"));

        System.out.println(cumle.charAt(0) +""+ cumle.charAt(1)+""+
                cumle.charAt(2)+""+cumle.charAt(3));

        System.out.println(cumle.toUpperCase().charAt(5)+cumle.toLowerCase().charAt(1));

        //Wrapper Class. CHARACTER.
        String yeni =""+Character.toUpperCase(str1.charAt(5))+
                Character.toLowerCase(str1.charAt(6)+Character.toLowerCase(str1.charAt(7)));
    }
}
