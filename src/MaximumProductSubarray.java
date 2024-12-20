public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[nums.length - 1 - i];
            max = Math.max(left, Math.max(right, max));
        }

        return max;
    }
}
