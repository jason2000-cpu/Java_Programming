
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Closing Resources After Use
 */

public class DemoTwo {
    public static void main(String a[]) {
        
        System.out.println("Enter a Number");


        BufferedReader bf = null;

        //Method One - Closing using finally block
        // try {
        //     /**
        //      * readLine returns a string and therefore should
        //      * be converted to int as below
        //      */

        //     bf = new BufferedReader(new InputStreamReader(System.in));
        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println("YOU HAVE ENTERED ::: " + num);

        // } catch (IOException e) {
        //     System.err.println(e.getMessage());
        // } finally {
        //     try {
        //         //make sure to close the resource
        //         bf.close();
        //     } catch (IOException ex) {
        //     }
        // }


        //Method Two - closing using "Try with resources" this autocloses it self

        try(BufferedReader bff = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt((bff.readLine()));
            System.out.println("You Have Entered :::: " + num);
        } catch (IOException ex) {
        }

    }
}