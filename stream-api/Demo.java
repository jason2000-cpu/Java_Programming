
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Demo{
    public static void main(String a[]) {
        // List<Integer> nums = new ArrayList<>();
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n *2);
        // int result = s3.reduce(0, (c, e) -> c+ e);

        
        //Chaining Streams

        int result = nums.stream()
        .filter(n -> n%2 == 0)
        .map(n -> n * 2)
        .reduce(0, (c, e) -> c + e);


        // s3.forEach(n -> System.out.println(n));
        System.out.println("Result :: " + result);


    }
}