public class JumpGameII {
    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int idx = 0;
        int count = 0;

        while (idx < nums.length - 1) {
            int farthest = 0;
            int next = 0;
            for (int i = 1; i <= nums[idx]; i++) {
                if (idx + i >= nums.length - 1) {
                    return ++count;
                }
                if (farthest <= nums[idx + i] + i) {
                    farthest = nums[idx + i] + i;
                    next = idx + i;
                }
            }
            count++;
            idx = next;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,9,8,7,6,5,4,3,2,1,1,0};
        System.out.println(jump(nums));
    }

}
