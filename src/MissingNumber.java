import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        sum = Arrays.stream(nums).sum();
        return (1 + nums.length) * (nums.length) / 2 - sum;
    }
}
