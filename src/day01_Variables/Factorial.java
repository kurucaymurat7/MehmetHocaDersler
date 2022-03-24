import java.util.*;
import java.io.*;

class Main {


    public static int FirstFactorial(int num) {
        for (int i=1; i<num; i++)
            num = num*i;
        return num;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("sayı=");
        System.out.print(FirstFactorial(s.nextInt()));
    }

}
