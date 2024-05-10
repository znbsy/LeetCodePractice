import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {

        int count = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (var a: connections) {
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(-a[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next : graph.get(curr)) {
                if (!visited[Math.abs(next)]) {
                    count += next > 0 ? 1 : 0; // Increment count if it's a forward edge
                    queue.add(Math.abs(next));
                    visited[Math.abs(next)] = true;
                }
            }

        }

        return count;


    }


}
