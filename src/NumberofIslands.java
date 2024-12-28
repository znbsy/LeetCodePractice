import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {

    public int numIslands(char[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    helper(grid, i, j);
                    ans++;
                }
            }
        }

        return ans;
    }


    public void helper(char[][] grid, int i, int j) {

        grid[i][j] = '0';
        if (i - 1 >= 0 && grid[i - 1][j] == '1') {
            helper(grid, i - 1, j);
        }

        if (i + 1 < grid.length && grid[i + 1][j] == '1') {
            helper(grid, i + 1, j);
        }

        if (j - 1 >= 0 && grid[i][j - 1] == '1') {
            helper(grid, i, j - 1);
        }

        if (j + 1 < grid[0].length && grid[i][j + 1] == '1') {
            helper(grid, i, j + 1);
        }


    }
}
