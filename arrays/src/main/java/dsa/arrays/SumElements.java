package dsa.arrays;

public class SumElements {
    public static int sum(int[] arr) {
        int total = 0;
        if (arr == null) return total;      // treat null as empty → 0
        for (int x : arr) {
            total += x;
        }
        return total;
    }
}