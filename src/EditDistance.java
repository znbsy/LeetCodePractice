public class EditDistance {

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        dp[0][0] = 0;

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                System.out.println("i: " + i + ", " + word1.charAt(i - 1) +
                        " j: " + j + ", " + word2.charAt(j - 1));

                int x = dp[i - 1][j - 1] + (word1.charAt(i - 1) != word2.charAt(j - 1)? 1: 0);
                int y = dp[i][j - 1] + 1;
                int z = dp[i - 1][j] + 1;

                System.out.println(x + " " + y + " " + z);

                if (y <= z) {
                    dp[i][j] = Math.min(x, y);
                } else {
                    dp[i][j] = Math.min(x, z);
                }

                System.out.println("dp[" + i + "][" + j +"] = " + dp[i][j]);
            }
        }

        return dp[n][m];


    }

    public static void main(String[] args) {
        System.out.println(minDistance("abc", "bca"));
    }
}
