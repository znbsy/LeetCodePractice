import java.util.*;
public class IdentifytheLargestOutlierinanArray {
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (var a: nums) {
            sum += a;
            map.put(2 * a, map.getOrDefault(2 * a, 0) + 1);
        }
        int ans = Integer.MIN_VALUE;
        for (var a: nums) {
            int temp = sum - a;
            if (map.containsKey(temp)) {
                if (map.get(temp) >= 2 || (map.get(temp) == 1 && temp != a * 2)) {
                    ans = Math.max(ans, a);
                }
            }
        }

        return ans;
    }
}
