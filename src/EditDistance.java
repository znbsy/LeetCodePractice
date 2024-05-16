public class EditDistance {

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        dp[0][0] = 0;

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int x = dp[i - 1][j - 1] + 1;
                int y = dp[i][j - 1] + 1;
                int z = dp[i - 1][j] + 1;

                if (y <= z) {
                    if (x <= y) {
                        dp[i][j] = x;
                    } else {
                        dp[i][j] = y;
                    }
                } else {
                    if (x <= z) {
                        dp[i][j] = x;
                    } else {
                        dp[i][j] = z;
                    }
                }
            }
        }

        return dp[n][m];


    }
}
