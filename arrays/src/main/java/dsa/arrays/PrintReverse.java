package dsa.arrays;

import java.util.Arrays;

public class PrintReverse {

    // Prints the elements back-to-front, space-separated, on one line.
    public static void printReverse(int[] a) {
        if (a == null) {
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
            if (i > 0) sb.append(' ');
        }
        System.out.println(sb);
    }

    // Returns a NEW array in reverse order, leaving the input untouched.
    public static int[] reversed(int[] a) {
        if (a == null) return null;
        int[] out = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = a[a.length - 1 - i];
        }
        return out;
    }

    // Reverses the array IN PLACE (mutates the caller's array) and returns it.
    public static int[] reverseInPlace(int[] a) {
        if (a == null) return null;
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int tmp = a[lo];
            a[lo] = a[hi];
            a[hi] = tmp;
            lo++;
            hi--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printReverse(nums);                      // 5 4 3 2 1
        System.out.println(Arrays.toString(reversed(nums)));  // [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(nums));            // [1, 2, 3, 4, 5] — unchanged
    }
}