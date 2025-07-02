
import java.util.HashMap;
import java.util.Map;

/**
 * Implementing Map
 */

 
public class DemoTwo {
    public static void main(String a[]) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Reg", 3399);
        students.put("Pos", 2);
        students.put("Stream", 3 );

        System.out.println("Student Details ::: " + students);

        System.out.println("\n");

        // accessing map elements
        System.out.println("Student Registration Number ::: " + students.get("Reg"));

        System.out.println("\n");

        // updating values
        students.put("Pos", 5);
        System.out.println("Student New Position ::: " + students.get("Pos"));

        System.out.println("\n");

        //Printing all the values of a Map
        for (String key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }

        System.out.println("\n");

        // clearing the key-value pairs
        students.clear();
        System.out.println("Empty Student Details ::: "+  students);
    }
}