
@FunctionalInterface
interface X {

    void show(int i);
}

class A implements X {

    public void show(int i) {
        System.out.println("IN SHOW A" + i);
    }
}

public class Demo {

    public static void main(String a[]) {

        A obj1 = new A();
        obj1.show(1);

        //using anonymous inner class
        X obj2 = new X() {
            public void show(int i) {
                System.out.println("IN SHOW B" + i);
            }
        };

        obj2.show(3);

        // using lambda expression
        X obj3 = i -> System.out.println("IN SHOW C" + i);

        obj3.show(5);
    }
}
