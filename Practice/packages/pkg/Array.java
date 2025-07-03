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
}

