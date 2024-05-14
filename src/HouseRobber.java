import java.util.Arrays;

public class HouseRobber {
    int[] mem;
    public int rob(int[] nums) {
        mem = new int[nums.length];
        Arrays.fill(mem, -1);

        return helper(nums, 0);


    }

    public int helper (int[] nums, int idx) {
        if (idx == nums.length - 1) {
            return nums[idx];
        }


        if (idx + 2 < nums.length && mem[idx + 2] == -1) {
            mem[idx + 2] = helper(nums, idx + 2);
        }

        if (idx + 3 < nums.length && mem[idx + 3] == -1) {
            mem[idx + 3] = helper(nums, idx + 3);
        }

        return Math.max(nums[idx] + (idx + 2 >= nums.length? 0 :mem[idx + 2]),
                nums[idx + 1] + (idx + 3 >= nums.length? 0 :mem[idx + 3]));
    }
}
