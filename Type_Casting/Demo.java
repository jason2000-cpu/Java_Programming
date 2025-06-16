
class A {

    void show1() {
        System.out.println(":::: IN SHOW A ::::");
    }
}

class B extends A {

    void Show2() {
        System.out.println(":::: IN SHOW B ::::");
    }
}

public class Demo {

    public static void main(String a[]) {
        /**
         * Up Casting
         *
         * obj is of type B (subclass) but is up casted to type A
         */
        A obj = (A) new B();
        obj.show1();

        /**
         * Down Casting
         *
         * obj is of type A (super class) but is down casted to type B
         */
        B obj1 = (B) obj;

        obj1.Show2();

    }
}
