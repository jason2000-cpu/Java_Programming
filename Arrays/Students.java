
class Student {

    int rollno;
    int marks;
    String name;
}

public class Students {

    public static void main(String a[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsha";
        s2.marks = 67;

        Student members[] = new Student[2];

        members[0] = s1;
        members[1] = s2;

        for (Student member : members) {
            System.out.println(member.marks);
        }
    }
}
