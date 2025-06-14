package tools;

public class MoreAdvCalc extends Calc {
    public int Sub(int a, int b) {
        Calc cal = new Calc();
        System.out.println(cal.add(a, b));
        return a - b;
    }
}
