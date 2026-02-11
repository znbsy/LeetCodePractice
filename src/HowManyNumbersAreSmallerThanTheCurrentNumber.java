import java.util.*;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        int processed = 0;
        int prevValue = -1;
        int prevCount = 0;

        while (!pq.isEmpty()) {
            int[] temp = pq.poll();

            if (temp[0] != prevValue) {
                prevCount = processed;
            }

            ans[temp[1]] = prevCount;
            prevValue = temp[0];
            processed++;
        }

        return ans;

    }
}
