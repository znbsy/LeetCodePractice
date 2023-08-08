import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (k == 0) {
                break;
            }
            if (nums[i] <= 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-4};
        System.out.println(largestSumAfterKNegations(nums, 4));
    }
}
