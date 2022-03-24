package day16_ForLoop;

import java.util.Scanner;

public class C00_InterviewQuestion {
    public static void main(String[] args) {
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den
        //baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin
        System.out.println("100'den kucuk bir tamsayi giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        for (int i=1; i<=sayi; i++){
            if (i%3==0 && i%5!=0){
                System.out.println("Java");
            } else if (i%3!=0 && i%5==0) {
                System.out.println("Guzeldir");
            } else if (i%3==0 && i%5==0) {
                System.out.println("Java Guzeldir");
            } else {
                System.out.println(i);
            }
        }
    }
}
