public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0 && i - 1 >= 0 && j - 1 >= 0) {

                    int t = matrix[i - 1][j];
                    int l = matrix[i][j - 1];
                    int lt = matrix[i - 1][j - 1];

                    matrix[i][j] = Math.min(t, Math.min(l, lt)) + 1;

                }
                count += matrix[i][j];
            }
        }
        return count;
    }
}
