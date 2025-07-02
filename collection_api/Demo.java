import java.util.ArrayList;
import java.util.List;


public class Demo{
    public static void main(String a[]) {
        /**
         * using collection to declare an array of integers
         * 
         * "Collection" can also be replaced with "List" wich
         * offers more methods to manipulate the array
         */

        // Collection<Integer> nums = new ArrayList<>();

        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(10);
        nums.addFirst(11);

        System.out.println("ARRAY SIZE ::: "+ nums.size());

        System.out.println("NUMS ARRAY ::: "  + nums);

        for (int num : nums) {
            System.out.println("ITEM ::: " + num);
        }
    }
}