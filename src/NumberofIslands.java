import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    int ans = 0;
    public int numIslands(char[][] grid) {


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    helper(grid, i, j);
                }
            }
        }

        return ans;
    }


    public void helper(char[][] grid, int i, int j) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{i ,j});
        grid[i][j] = '0';


        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            if (curr[0] + 1 < grid.length && grid[curr[0] + 1][curr[1]] == '1') {
                queue.add(new int[]{curr[0] + 1,curr[1]});
                grid[curr[0] + 1][curr[1]] = '0';
            }

            if (curr[0] - 1 >= 0 && grid[curr[0] - 1][curr[1]] == '1') {
                queue.add(new int[]{curr[0] - 1,curr[1]});
                grid[curr[0] - 1][curr[1]] = '0';
            }

            if (curr[1] + 1 < grid[0].length && grid[curr[0]][curr[1] + 1] == '1') {
                queue.add(new int[]{curr[0],curr[1] + 1});
                grid[curr[0]][curr[1] + 1] = '0';
            }

            if (curr[1] - 1 >= 0 && grid[curr[0]][curr[1] - 1] == '1') {
                queue.add(new int[]{curr[0],curr[1] - 1});
                grid[curr[0]][curr[1] - 1] = '0';
            }


        }
        ans++;


    }
}
