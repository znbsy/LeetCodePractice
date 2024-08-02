import java.util.Arrays;

public class MinimumPathSum {
    int[][] mem;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        mem = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(mem[i], -1);
        }

        return helper(grid, 0, 0);
    }

    public int helper(int[][] grid, int row, int col) {
        if (row >= grid.length || col >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if (mem[row][col] != -1) {
            return mem[row][col];
        }

        int down = helper(grid, row + 1, col);
        int right = helper(grid, row, col + 1);

        mem[row][col] = grid[row][col] + Math.min(down, right);
        return mem[row][col];
    }
}
