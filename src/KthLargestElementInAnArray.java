import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.reverseOrder());

        for (var a: nums) {
            pq.add(a);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        int ans = 0;

        while (!pq.isEmpty()) {
            ans = pq.remove();
        }

        return ans;

    }
}
