import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[][] sortedNums = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = new int[]{i, nums[i]};
        }



        Arrays.sort(sortedNums, (a, b) -> Integer.compare(a[1], b[1]));
        int left = 0;
        int right = nums.length - 1;


        while (left < right) {
            int sum = sortedNums[left][1] + sortedNums[right][1];
            if (sum == target) {
                //System.out.println("hiiii");
                return new int[]{sortedNums[left][0], sortedNums[right][0]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{sortedNums[left][0], sortedNums[right][0]};
    }
}
