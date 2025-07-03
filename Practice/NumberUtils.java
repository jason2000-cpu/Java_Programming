

class utils {

    public boolean isNarcissistic(int number) {
        // TODO replace with your code

        
        String num = Integer.toString(number);
        int size = num.length();
        char[] numArray = num.toCharArray();
        int totalPows = 0;

        for (int i : numArray) {
            int numI = Integer.parseInt(Character.toString(i));
            int result = (int) Math.pow(numI, size);
            totalPows += result;
        }

        System.out.println("TOTAL POWERS ::: " + totalPows);

        return totalPows == number;
    }
}

public class NumberUtils {
    public static void main(String a[]) {

        utils util = new utils();

        util.isNarcissistic(153);
        // util.isNarcissistic(1634);
        // util.isNarcissistic(112);
    }
}
