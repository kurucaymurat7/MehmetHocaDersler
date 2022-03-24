package day18_NestedforLoop;

public class C05_NestedforLoop_ABCDEF {
    public static void main(String[] args) {

        //       A
        //       A B
        //       A B C
        //       A B C D
        //       A B C D E
        //       A B C D E F
        //       şeklini yazdırınız.  65=A'nın ascii değeri

        char input = 'F';

        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        input = 'F';
        int sayi = Character.valueOf(input);

        for (char i = 65; i <= sayi; i++) {
            for (char j = 65; j <= i; j++) {
                System.out.print(" " + Character.toString(j));
            }
            System.out.println();
        }
        //String letter = Character.toString(65);
    }

}
