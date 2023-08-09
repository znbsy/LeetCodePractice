public class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        int count = 0;
        int flag = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= flag) {
                flag = flag + 1;
                count = count + flag - nums[i];
            } else {
                flag = nums[i];
            }
        }
        return count;
    }
}
