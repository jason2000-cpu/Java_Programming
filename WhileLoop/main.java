public class main {
    public static void main(String a[]) 
    {
        int i = 1;

        while(i <= 5)
        {
            int j = 1;
            System.out.println("Hi" + i);
            while (j <= 3) {
                System.out.println("Hello," + j);
                j++;
            }
            i++;
        }

        System.out.println("Bye"+ i);
    }
}