package dsa.arrays;

import java.util.Arrays;


public class CopyArray {
    public static int[] copy(int[] arr) {
        int [] result = Arrays.copyOf(arr,arr.length);
        return result;
    }
}
