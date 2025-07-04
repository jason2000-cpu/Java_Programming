
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
    
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }

}



public class DemoTwo {
    public static void main(String a[]) {
        List<Student> students = new ArrayList<>();

        // Comparator<Student> comp = new Comparator<Student>(){
        //     public int compare(Student i, Student j) {
        //         if (i.age > j.age) 
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        /**
         * since "Comparator" is a functional interface we
         * can use lambda functions
         */

        // Comparator<Student> comp = (Student i, Student j) -> {
        //         if (i.age > j.age) 
        //             return 1;
        //         else
        //             return -1;            
        // };

        //Even More Shorter "one-liner code"

        Comparator<Student> comp = (Student i, Student j) -> i.age > j.age ? 1 : -1;

        students.add(new Student(16, "James"));
        students.add(new Student(14, "Lucy"));
        students.add(new Student(19, "Ann"));
        students.add(new Student(10, "Peter"));
        students.add(new Student(18, "John"));

        System.out.println("Before Sorting");

        for (Student stud : students) {
            System.out.println(stud);
        }

        //Sorting the students based on age
        Collections.sort(students, comp);

        System.out.println("\n");

        System.out.println("After Sorting");

        for (Student stud : students) {
            System.out.println(stud);
        }

        


    }
}