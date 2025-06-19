
enum Status {
    Running, Pending, Success,
    Failed;
}

public class Demo {

    public static void main(String a[]) {
        Status s = Status.Failed;

        // Printing one enum value and its ordinal
        System.out.println(s + " : " + s.ordinal());

        // printing all enum values and their ordninals
        Status ss[] = Status.values();

        for (Status st : ss) {
            System.out.println(st + " : " + st.ordinal());
        }
    }
}
