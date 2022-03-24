package day19_doWhileLoop;

public class C07_ForWhileLoop {
    public static void main(String[] args) {
        //For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        //bolunebilen sayilari yazdirin.

        String bolunenler15 = " ";
        String bolunenler20 = " ";
        String bolunenler90 = " ";
        String bolunenlerhepsi = " ";

        for (int i = 100; i <= 999; i++) {
            if (i%15 == 0) {
                bolunenler15+=Integer.valueOf(i) + ", ";
            }   if (i%20==0){
                bolunenler20 += Integer.valueOf(i) + ", ";
            }   if (i%90==0) {
                bolunenler90 += Integer.valueOf(i) + ", ";
            }   if (i%15 == 0 && i%20==0 && i%90==0 ) {
                bolunenlerhepsi += Integer.valueOf(i) + ", ";
            }
        }

        System.out.println("15e boluneneler =  " + bolunenler15);
        System.out.println("20ye boluneneler =  " + bolunenler20);
        System.out.println("90a boluneneler =  " + bolunenler90);
        System.out.println("Hepsine bolunenler = " + bolunenlerhepsi);
    }
}
