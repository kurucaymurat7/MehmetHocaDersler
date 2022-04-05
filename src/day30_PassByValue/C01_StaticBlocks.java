package day30_PassByValue;

public class C01_StaticBlocks {

    static { // ilk olarak static block calisir.
        System.out.println("Static block1");
    }
    static { // ilk olarak static block calisir.
        System.out.println("Static block2");
    }

    C01_StaticBlocks() {
        System.out.println("Constructor calisti.");
    }

    public static void main(String[] args) {
        System.out.println("Main block");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
    }
}


