public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int max = -1;

        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > curr) {
                max = Math.max(max, nums[i] - curr);
            } else if (nums[i] < curr) {
                curr = nums[i];
            }
        }

        return max;
    }
}
