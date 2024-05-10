import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[isConnected.length];

        for (int j = 0; j < isConnected.length; j++) {
            if (visited[j]) {
                continue;
            }

            count++;

            queue.add(j);
            visited[j] = true;

            while (!queue.isEmpty()) {
                int curr = queue.remove();

                for (int i = 0; i < isConnected[curr].length; i++) {
                    if (!visited[i] && isConnected[curr][i] == 1) {
                        queue.add(i);
                        visited[i] = true;
                    }
                }

            }
        }

        return count;


    }
}
