public class MaxAreaOfIsland {
    int area;
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    bfs(i, j, grid);
                    count = Math.max(count, area);
                    area = 0;
                }
            }
        }
        return count;
    }
    public void bfs (int row, int col, int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0
                || col >= grid[0].length || grid[row][col] != 1) {
            return;
        }
        grid[row][col] = 0;
        area++;

        bfs(row - 1, col, grid);
        bfs(row + 1, col, grid);
        bfs(row, col + 1, grid);
        bfs(row, col - 1, grid);


    }
}
