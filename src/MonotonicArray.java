public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) return true;
        int pt = 1;

        while (pt < nums.length && nums[pt - 1] == nums[pt]) {
            pt++;
        }
        if (pt == nums.length) return true;

        boolean flag = nums[pt] > nums[pt - 1];
        for (int i = pt + 1; i < nums.length; i++) {
            if (flag) {
                if (nums[i] < nums[i - 1]) return false;
            } else {
                if (nums[i] > nums[i - 1]) return false;
            }
        }
        return true;
    }
}
