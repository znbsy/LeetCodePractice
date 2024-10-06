public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;


        int[][] dp = new int[n][m];
        boolean flag = true;
        for (int i = n - 1; i >= 0; i--) {
            if (flag && obstacleGrid[i][m - 1] != 1) {
                dp[i][m - 1] = 1;
            } else {
                flag = false;
            }
        }
        flag = true;

        for (int j = m - 1; j >= 0; j--) {
            if (flag && obstacleGrid[n - 1][j] != 1) {
                dp[n - 1][j] = 1;
            } else {
                flag = false;
            }
        }


        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }

        return dp[0][0];


    }
}
