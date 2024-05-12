import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pql = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>();

        int l = 0;
        int r = costs.length -1 ;
        long ans = 0L;


        for (int i = 0; i < k; i++) {
            while (pql.size() < candidates && l <= r) {
                pql.add(costs[l++]);
            }

            while (pqr.size() < candidates && l <= r) {
                pqr.add(costs[r--]);
            }

            int t1 = pql.size() > 0 ? pql.peek() : Integer.MAX_VALUE;
            int t2 = pqr.size() > 0 ? pqr.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                ans += t1;
                pql.poll();
            } else {
                ans += t2;
                pqr.poll();
            }
        }

        return ans;


    }
}
