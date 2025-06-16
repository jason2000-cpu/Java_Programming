
// This Class Cannot be Inherited from
final class A {

    final int var = 10;

    // this method cannot be overridden
    final void show() {
        // An error is raised trying to assign a final variable
        var = 20;
        System.out.println(":::: IN SHOW A ::::");
    }
}

// An Error is raised trying to create a subclass of A
class B extends A {

    // An Error is raised trying to override show method in A
    void show() {
        System.out.println(":::: IN SHOW B ::::");
    }
}

public class Demo {

    public static void main(String a[]) {
        A obj = new A();
        obj.show();
    }
}
