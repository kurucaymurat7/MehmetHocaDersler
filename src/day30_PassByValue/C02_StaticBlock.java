package day30_PassByValue;

public class C02_StaticBlock {
    {
        System.out.println("Statik olmayan method calisti");
    }

    static{
        System.out.println("Statik olmayan method calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        C02_StaticBlock obj1 = new C02_StaticBlock();
        C02_StaticBlock obj2 = new C02_StaticBlock();
    }
}


