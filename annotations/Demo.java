
class A {

    public void show() {
        System.out.println("A --> Hello, World!");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("B --> Hello, World!");
    }
}

public class Demo {

    public static void main(String a[]) {
        A obj1 = new A();
        obj1.show();

        System.out.println("\n");

        B obj2 = new B();
        obj2.show();

    }
}
