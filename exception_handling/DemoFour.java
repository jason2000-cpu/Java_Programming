/**
 * Learning "throws" keyword
 * 
 * This keyword tells java compiler and anyone
 * calling your method that the method might
 * throw the said type of exception and it must
 * be handled or declared
 */
import java.io.IOException;

class A {
    void show() throws IOException{
        throw new IOException("Input/Output exception Error Occured");
    }
}


public class DemoFour {
    public static void main(String a[]) {
        A obj = new A();
        try {
            obj.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}