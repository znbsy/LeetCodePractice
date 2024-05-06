import java.util.*;

public class MaxNumberOfK_SumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> set = new HashMap<>();
        int count = 0;

        for (var n: nums) {
            set.compute(n, (key, value) -> (value == null) ? 1 : value + 1);
        }

        Set<Integer> keys = set.keySet();
        for (var e: keys) {
            int v = set.get(e);
            if (keys.contains(k - e) && v != 0) {
                if (e != k -e) {
                    count += Math.min(v, set.get(k - e));
                } else {
                    count += v / 2;
                }

                set.put(k - e, 0);
            }
            set.put(e, 0);

        }

        return count;
    }
}
