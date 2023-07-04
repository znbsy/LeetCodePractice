public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] p = new int[2];
        p[0] = cost[0];
        p[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int min = Math.min(p[0], p[1]);
            p[0] = p[1];
            p[1] = min + cost[i];
        }
        return Math.min(p[0], p[1]);
    }
}
