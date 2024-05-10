import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int minute = -1;
        int fresh = 0;
        int[][] dir =  {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        if (queue.isEmpty()) {
            return -1;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] curr = queue.remove();
                size--;
                int row = curr[0];
                int col = curr[1];

                for (var d : dir) {
                    int r = row + d[0];
                    int c = col + d[1];

                    if (r >= 0 && r < grid.length
                            && c >= 0 && c < grid[0].length
                            && grid[r][c] == 1) {

                        grid[r][c] = 2;
                        fresh--;
                        queue.add(new int[]{r, c});

                    }
                }
            }
            minute++;

        }

        return fresh == 0? minute: -1;
    }
}
