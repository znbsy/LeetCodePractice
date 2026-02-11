import java.util.*;

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < times.length; i++) {
            if (!map.containsKey(times[i][0])) {
                map.put(times[i][0], new HashMap<>());

            }
            map.get(times[i][0]).put(times[i][1], times[i][2]);
        }

        boolean[] visited = new boolean[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, k});

        int ans = 0;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int dist = cur[0];
            int node = cur[1];

            if (visited[node - 1]) {
                continue;
            }

            visited[node - 1] = true;
            n--;
            ans = dist;

            if (map.containsKey(node)) {
                for (Integer key : map.get(node).keySet()) {
                    pq.add(new int[]{dist + map.get(node).get(key), key});
                }
            }


        }
        return n == 0 ? ans : -1;
    }

}
