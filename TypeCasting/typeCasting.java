public class typeCasting {
    public static void main(String a[]) 
    {
        // byte byte1 = 120;
        // int byte2 = byte1;  //type of byte1 is casted to byte2

        // System.out.println(byte2);

        int c = 257;
        byte k = (byte) c; // k will be 1 as the remainder of 257/256 is 1

        float f = 5.6f;
        int t = (int) f; // t will be 5 as  the decimal part is lost on type casting

        System.out.println(t);


        //Type Promotion
        byte byte1 = 126;
        int int1 = byte1 * byte1; // since this the result of the operation is out of range type of byte1 is automatically promoted to int

        System.out.println(int1);

    }
}

