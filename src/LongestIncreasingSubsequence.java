public class LongestIncreasingSubsequence {
    int[] mem;
    public int lengthOfLIS(int[] nums) {
        mem = new int[nums.length];
        //Arrays.fill(mem, 1);
        //mem[nums.length - 1] = 1;
        helper(nums, 0);
        int count = 1;
        for (var a: mem) {
            if (a > count) {
                count = a;
            }
        }
        return count;

    }

    public int helper(int[]nums, int idx) {
        if (idx >= nums.length) {

            return 0;
        }
        if (idx == nums.length - 1) {
            mem[idx] = 1;
            //System.out.println(nums[idx] + " " + mem[idx]);
            return 1;
        }
        if (mem[idx] != 0) {
            //System.out.println(nums[idx] + " " + mem[idx]);
            return mem[idx];
        }

        for (int i = idx + 1; i < nums.length; i++) {
            int temp = helper(nums, i);
            if (nums[i] > nums[idx]) {
                mem[idx] = Math.max(mem[idx], temp + 1);
            }

        }
        if (mem[idx] == 0) mem[idx] = 1;
        //System.out.println(nums[idx] + " " + mem[idx]);
        return mem[idx];
    }
}
