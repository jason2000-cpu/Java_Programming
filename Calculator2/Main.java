
public class Main {

    public static void main(String a[]) {
        System.out.println("Hello, World");

        Calc calc1 = new Calc();

        System.out.println("::: Parent Class Calculations :::");
        System.out.println(calc1.add(1, 2));
        System.out.println(calc1.sub(4, 1));

        System.out.println("\n");

        System.out.println("::: AdvCalc Class Calculations :::");

        AdvCalc calc2 = new AdvCalc();
        System.out.println(calc2.add(1, 2));
        System.out.println(calc2.sub(4, 1));
        System.out.println(calc2.mul(4, 3));
        System.out.println(calc2.div(4, 3));

        System.out.println("\n");

        System.out.println("::: VeryAdvCalc Class Calculations :::");

        VeryAdvCalc calc3 = new VeryAdvCalc();
        System.out.println(calc3.add(1, 2));
        System.out.println(calc3.sub(4, 1));
        System.out.println(calc3.mul(4, 3));
        System.out.println(calc3.div(4, 3));
        System.out.println(calc3.pow(4, 3));
        System.out.println(calc3.rem(4, 3));
    }
}
