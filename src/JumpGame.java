public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int idx = 0;

        while (idx < nums.length - 1) {
            int farthest = 0;
            int next = 0;
            for (int i = 1; i <= nums[idx]; i++) {
                if (idx + i >= nums.length - 1) {
                    return true;
                }
                if (farthest <= nums[idx + i] + i) {
                    farthest = nums[idx + i] + i;
                    next = idx + i;
                }
            }
            if (nums[idx] == 0) {
                return false;
            }
            idx = next;
        }
        return false;
    }
}
