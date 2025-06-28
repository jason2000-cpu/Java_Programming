
@FunctionalInterface
interface X {

    int add(int i, int j);
}

public class DemoTwo {

    public static void main(String a[]) {

        X obj1 = new X() {
            public int add(int i, int j) {
                return i + j;
            }
        };

        X obj2 = (i, j) -> i + j;
        int add = obj2.add(5, 4);

        System.out.println("Result  " + add);

    }
;
}
