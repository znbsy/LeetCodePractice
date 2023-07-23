public class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int k = 0;
        for (int i = left; i <= right; i++) {
            k += this.nums[i];
        }
        return k;
    }
}

