
class A {

    void show() {
        System.out.println(":::: IN SHOW A ::::");
    }

}

public class Demo {

    public static void main(String a[]) {

        A obj = new A() {
            //Defining an anonymous class with an overidden method show
            void show() {
                System.out.println(":::: IN SHOW B ::::");
            }
        };

        obj.show();
    }
}
