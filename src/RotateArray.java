import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int actual = k % nums.length;

        int[] result = new int[nums.length];

        System.arraycopy(Arrays.copyOfRange(nums, nums.length - actual, nums.length),
                0, result, 0, actual);

        System.arraycopy(Arrays.copyOfRange(nums, 0, nums.length - actual),
                0, result, actual,  nums.length - actual);

        for (int i = 0; i < nums.length; i++){
            nums[i] = result[i];
        }

    }

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        rotate(new int[]{-1,-100,3,99}, 2);
    }
}
