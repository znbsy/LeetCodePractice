import java.util.*;
public class MinimumAbsoluteDifferenceBetweenElementsWithConstraint {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int ans = Integer.MAX_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = x; i < nums.size(); i++) {
            set.add(nums.get(i - x));
            Integer high = set.ceiling(nums.get(i));
            Integer low = set.floor(nums.get(i));
            if (high != null) {
                ans = Math.min(ans, high - nums.get(i));
            }
            if (low != null) {
                ans = Math.min(ans, nums.get(i) - low);
            }
        }
        return ans;
    }


}
