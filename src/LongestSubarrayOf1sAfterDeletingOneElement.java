public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        int k = 1;

        for (; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }

            if (k >= 0) {
                max = Math.max(max, right - left);
            }

        }
        return max;
    }
}
