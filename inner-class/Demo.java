
class A {

    void show() {
        System.out.println("::::  IN SHOW ::::");
    }

    //Inner class
    class B {

        public void config() {
            System.out.println(":::: IN CONFIG ::::");
        }
    }
}

public class Demo {

    public static void main(String a[]) {

        A obj = new A();

        obj.show();

        // instantiating an innner class
        A.B obj1 = obj.new B();

        // Accessing methods of an inner class
        obj1.config();
    }
}
