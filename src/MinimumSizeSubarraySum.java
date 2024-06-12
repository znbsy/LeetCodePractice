import java.util.*;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum >= target) {
                count = Math.min(count, i - left + 1);
                if (count == 1) {
                    return 1;
                }
                sum -= (nums[left] + nums[i]);
                left++;
                i--;
            }
        }

        if (left == 0) {
            return 0;
        }

        while (left < nums.length) {
            if (sum < target) {
                break;
            } else {
                count = Math.min(count, nums.length - left);
                sum -= nums[left];
                left++;
            }
        }




        return count;



    }
}
