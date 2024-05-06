public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int head = -1;
        int end = k - 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (end < nums.length) {
            if (head == -1) {
                for (int i = 0; i <= end; i++) {
                    sum += nums[i];
                }
                max = sum;
            } else {
                sum = sum - nums[head] + nums[end];
                max = Math.max(max, sum);
            }
            head++;
            end++;
        }

        return (double) max / k;

    }
}
