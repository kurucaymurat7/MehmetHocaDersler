package day20_ScopeArrays;

public class C04_InstanceLocalStaticVariables {
    int num1;
    String name = "Ali";
    static String ulke;

    public static void main(String[] args) {
        add();//static bir method, static olan bir class içerisinden çağrılabilir.
        //product(5); //static olmayan bir method, static bir class içerisinden çağrılamaz.
    }

    public static void add() { //return type muhakkak girilmelidir.
        //num1++; //static olmayan bir variable, static bir class içerisinde kullanılamaz.
        int num2 = 6; //local variable, sadece tanımlı olduğu class içeriside kullanılabilir.
        char letter;  //local variable, sadece tanımlı olduğu class içeriside kullanılabilir.
        System.out.println("Do addition ");
    }

    public void product(int num3) {
        name = "Veli"; //static olmayan bir değişken, static olmayan bir method içerisinden çagırılabilir.
        //num2++; //local variables, sadece tanımlı olduğu sınıf içerisinde kullanılır.
        ulke = "Turkiye";//static variable, static olmayan bir method içerisinde kullanılabilir.
        System.out.println(num3 * num3);
    }
}


