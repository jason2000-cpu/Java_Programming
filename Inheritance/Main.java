
class A extends Object {

    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println("In Int A");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("In B");
    }

    public B(int n) {
        super(n);
        System.out.println("In Int B");
    }
}

public class Main extends B {

    public static void main(String a[]) {
        B b1 = new B();
    }
}
