import tools.Calc;

public class Main {
    public static void main(String a[])
    {
        
        Calc cal = new Calc();
        SubCalc calc2 = new SubCalc();

        System.out.println(cal.add(2, 4));
        System.out.println(calc2.add(2, 4));
    }
}

