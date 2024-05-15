public class UniquePaths {
    int[][] g;
    public int uniquePaths(int m, int n) {
        g = new int[m][n];

        return helper(m - 1, n - 1);

    }

    public int helper(int m, int n) {
//        System.out.println(m + " " + n);
        if (m < 0 || n < 0) {
            return 0;
        }
        if (m == 0 || n == 0) {
            return 1;
        }

        if (g[m][n] == 0) {
            g[m][n] = helper(m - 1, n) + helper(m, n - 1);
        }

        return g[m][n];
    }

}
