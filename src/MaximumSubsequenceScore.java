import java.nio.channels.Pipe;
import java.util.*;

public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        int[][] combine = new int[nums1.length][];

        for (int i = 0; i < combine.length; i++) {
            combine[i] = new int[] {nums1[i], nums2[i]};
        }

        Arrays.sort(combine, (a, b) -> b[1] - a[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0L;
        long ans = 0L;

        for (int i = 0; i < combine.length; i++) {
            sum += combine[i][0];
            pq.add(combine[i][0]);

            if (i >= k - 1) {
                ans = Math.max(ans, sum * combine[i][1]);
            }

            if (i >= k) {
                sum -= pq.remove();
            }
        }

        return ans;

    }
}
