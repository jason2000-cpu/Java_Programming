
class Calculator 
{
    public int add(int int1, int int2){
        return int1 + int2;
    }
}


public class Demo 
{
    public static void main(String a[]) 
    {
        Calculator calc = new Calculator();

        int result = calc.add(1, 2);

        System.out.println("Addition Result " + result);

    }
}