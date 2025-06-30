
public class DemoTwo {
    public static void main(String a[]) {
        int i = 20;
        int j = 18;
        int result = 0;

        try {
            result = j/i;
            /**We can also throw our own exception 
             * Here we check if i is greater than j
             * and throw an exception
            */

            if (i > j) throw new ArithmeticException("Int i Is Greater than 18.");

        } catch (ArithmeticException e) {
            System.out.println("Error:: " + e.getMessage());
        } catch (Exception e) { //The general exception catch should always be last
            System.out.println("An Unknown Error Occured");
        }
        
        System.out.println("The Result Is :::: " + result);
    }
}