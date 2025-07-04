
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Demo{
    public static void main(String a[]){
      List<Integer> nums = new ArrayList<>();
      
      nums.add(21);
      nums.add(19);
      nums.add(34);
      nums.add(10);



      System.out.println("Before Sorting ::: " + nums);
      Collections.sort(nums);
      
      System.out.println("After Sorting ::: " + nums);

      System.out.println("\n");

      /**
       * Custom sorting
       * 
       * One ca have a custom sorting by declaring a Comparator
       * and define the overidden method of the "Comparator" interface
       * 
       * In the example below, we are sorting based on the last integer
       * of a number
       * 
       */

       Comparator<Integer> comp = new Comparator<Integer>()
       {
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10) 
                    return 1;
                else
                    return -1;
            }
       };

       System.out.println("Before Sorting ::: " + nums);
       Collections.sort(nums, comp);
       
       System.out.println("After Sorting ::: " + nums);

    }
}