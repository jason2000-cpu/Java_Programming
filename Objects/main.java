
class Calculator 
{
    int a;

    public int add(int n1, int n2)
    {
        int res = n1 + n2;
        return res;
    }
}

public class main 
{
    public static void main(String a[]) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}