
enum Status {
    Running, Pending, Success, Failed
}

public class Demo {

    public static void main(String a[]) {
        Status s = Status.Failed;

        // using If statements
        // if (s == Status.Pending) {
        //     System.out.println("Processing is taking longer than expected");
        // }
        // if (s == Status.Failed) {
        //     System.out.println("We could not process your transaction. Kindly try again");
        // }
        // if (s == Status.Success) {
        //     System.out.println("Transaction completed sucessfully");
        // }
        // if (s == Status.Running) {
        //     System.out.println("Kindly wait as we process your transaction");
        // }
        //using Switch Statements (rule switch)
        switch (s) {
            case Running ->
                System.out.println("Kindly wait as we process your transaction");
            case Pending ->
                System.out.println("Processing is taking longer than expected");
            case Failed ->
                System.out.println("We could not process your transaction. Kindly try again later");
            case Success ->
                System.out.println("Transaction completed Successfully.");
            default ->
                throw new AssertionError();
        }
    }
}
