
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class DemoThree {
    public static void main(String a[]) {
        Comparator<String> comp = (String i, String j) -> i.length() > j.length() ? 1 : -1;
        
        List<String> strs = Arrays.asList("Hello", "Hi", "How are you", "Good Day", "Friend!");

        Collections.sort(strs, comp);


        System.out.println("Sorted Strs :: " + strs);


    }
}