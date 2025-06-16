
class A {

    void show() {
        System.out.println("::::In Show A::::");
    }
}

class B extends A {

    void show() {
        System.out.println("::::In Show B::::");
    }
}

class C extends A {

    void show() {
        System.out.println("::::In Show C::::");
    }
}

public class main {

    public static void main(String[] args) {
        // Dynamic method Dispatch
        A objDemo1 = new B();
        objDemo1.show();

        objDemo1 = new A();
        objDemo1.show();

        objDemo1 = new C();
        objDemo1.show();
    }
}
