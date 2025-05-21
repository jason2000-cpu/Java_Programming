public class main {
    public static void main(String a[]) {
        // int i = 1;

        // While Loop

        // while(i < 10) {
        //     System.out.println("Hello" + i);
        //     i++;
        // }


        // Do-While Loop

        // do {
        //     System.out.println("Hello"+ i);
        //     i++;
        // } while(i < 10);

        // For Loop

        // for (int j=1; j<=4; j++) {
        //     System.out.println("Hello " + j);
        // }


        // for (int j = 4; j > 0; j--) {
        //     System.out.println("Hello "+ j);
        // }

        for (int i = 1;  i <= 5; i++ ) {
            System.out.println("DAY " + i);
            for(int j = 1; j <= 9; j++ ) {
                System.out.println("  " + (j + 8) + "-" + (j + 9));
            }
        }


    }
}