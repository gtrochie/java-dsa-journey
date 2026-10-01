package dsa.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Intersection {
    public static List<Integer> intersect(int[] a, int[] b) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int x : a) {
            counts.merge(x, 1, Integer::sum);   // tally how many times each value shows up in a
        }

        List<Integer> result = new ArrayList<>();
        for (int x : b) {
            Integer remaining = counts.get(x);
            if (remaining != null && remaining > 0) {
                result.add(x);
                counts.put(x, remaining - 1);   // "use up" one occurrence
            }
        }
        return result;
    }
}