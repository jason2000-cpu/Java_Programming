
public class Demo {

    public static void main(String a[]) {
        int i = 2;
        int j = 18;
        int result = 0;
        String str = null;

        int nums[] = new int[5];

        try {
            result = j / i;
            System.err.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Range.");
        } catch (Exception e) { //The general exception catch should always be last
            System.out.println("An Unknown Error Occured");
        }

        System.out.println("The Result Is :::: " + result);
    }
}
