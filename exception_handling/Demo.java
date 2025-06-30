public class Demo {
    public static void main(String a[]) {
        int i = 4;
        int j = 18;
        int result = 0;

        try {
            result = j/i;
        } catch (Exception e) {
            System.out.println("Something went wrong ::::  " + e);
        }
        
        System.out.println("The Result Is :::: " + result);
    }
}