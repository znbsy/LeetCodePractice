import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        Arrays.sort(nums);
        int back = 0;

        List<Integer> ans = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (back > sum / 2) {
                break;
            } else {
                back += nums[i];
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
