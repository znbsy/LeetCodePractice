import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0, 1});

        while (!queue.isEmpty()) {
            int [] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int num = curr[2];
            if (row == n - 1 && col == n - 1) {
                return num;
            }
            grid[row][col] = 1;

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int x = row + i;
                    int y = col + j;
                    if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0) {
                        queue.offer(new int[] {x, y, num + 1});
                        grid[x][y] = 1;
                    }
                }
            }
        }
        return -1;
    }
}
