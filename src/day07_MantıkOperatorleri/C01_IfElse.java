package day07_MantıkOperatorleri;

public class C01_IfElse {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        //AND
        if ((a != b) && (a < b)) {
            System.out.println(a + b);
        }
        if (a + b > 5) {
            System.out.println("çalışmaz");
        }
        //OR
        if ((a == b) || (a < b)) {
            System.out.println("or çalışır");

        }
    }
}
