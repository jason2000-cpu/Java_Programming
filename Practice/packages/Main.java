import pkg.Array;


public class Main{
    public static void main(String a[]) {
        int[] arr = {1, 2, 3, 4};
        String[] arr1 = {"One", "Two", "Three"};
        double[] arr2 = {1.2, 3.4, 2.1};

        System.out.println("Length of Integer Array " + Array.length(arr));
        System.out.println("Length of String Array " + Array.length(arr1));
        System.out.println("Length of Double Array " + Array.length(arr1));

    }
}