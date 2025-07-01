
import java.util.InputMismatchException;
import java.util.Scanner;



public class Demo {
    public static void main(String a[]) {
        
        System.out.println("Enter a Number");

        //Method One

        /**
         * Getting input from user might throw IOException
         * therefore this exception must be  handled.
         */

        // try {
        //     /**
        //      * The "read" method of object "in" returns ascii values
        //      * therefore this is not the best way to accept input
        //      */
        //     int num = System.in.read();
        //     System.out.println("You have entered :::: " + num);

        // } catch (IOException e) {
        //     System.err.println(e.getMessage());
        // }


        // Method Two
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // try {
        //     /**
        //      * readLine returns a string and therefore should
        //      * be converted to int as below
        //      */

        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println("YOU HAVE ENTERED ::: " + num);

        //     //make sure to close the resource
        //     bf.close();

        // } catch (IOException e) {
        //     System.err.println(e.getMessage());
        // } 


        // Method Three

        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();

            System.out.println("USING SCANNER ::: You Have Entered ::: " + num);
        } catch (InputMismatchException e) {
            System.out.println("You Did Not Enter an Integer ::: " + e);
        }
        
    }
}