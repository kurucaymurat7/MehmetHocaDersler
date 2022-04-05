package day28_Constructor;

public class Deneme {

    Deneme() {

    }
    static int count = 0;

    int x;
    static int y;

    Deneme (int i) {
        x+=i;
        y+=i;
    }

    public void increment() {
        count++;
    }

    public static void main(String[] args) {
        Deneme obj1 = new Deneme();
        Deneme obj2 = new Deneme();

        obj1.increment();

        System.out.println("Obj1 = " + obj1.count);

        obj2.increment();

        System.out.println("Obj1 = " + obj1.count);

        System.out.println("Obj1 = " + obj2.count);

        new Deneme(2);
        Deneme dnm = new Deneme(3);
        System.out.println(dnm.x + " "+ dnm.y);


    }

}
