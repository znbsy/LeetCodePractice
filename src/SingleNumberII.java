import java.util.*;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        long sumall = 0;
        long sum = 0;

        for (var a: nums) {
            if (!set.contains(a)) {
                set.add(a);
                sum += a;
            }
            sumall += a;
        }

        return (int) ((3 * sum - sumall) / 2);

    }
}
