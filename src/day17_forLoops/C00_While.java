package day17_forLoops;

public class C00_While {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("While...");
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        i=0;
        System.out.print("Do While...");
        do {
            System.out.print(i + " ");
            i++;
        } while (i<10);
    }
}