package pkg;

public class Array{
    public static int length(int[] array) {
        int size = 0;
        for (int i : array) {
            size += 1;
        }
        return size;
    }

    public static int length(String[] array) {
        int size = 0;

        for (String i : array) {
            size += 1;
        }

        return size;
    }

    public static int[] slice(int[] array, int start, int stop) {

        int arrlength = length(array);
        int[] result = {};

        if (start < 0 || start > arrlength) throw new ArrayIndexOutOfBoundsException();
        if (start > stop) throw new IllegalArgumentException();
        if (array == null) throw new NullPointerException();


        return result;
    }
}

