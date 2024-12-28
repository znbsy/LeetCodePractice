import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        int total = m * n;

        //int[][] direction = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};


        int i = 0;
        int r = 0;
        int c = 0;

        while (i < total) {
            while (c < n && matrix[r][c] != Integer.MAX_VALUE) {
                res.add(matrix[r][c]);
                matrix[r][c] = Integer.MAX_VALUE;
                c++;
                i++;
            }
            c--;
            r++;
            while (r < m && matrix[r][c] != Integer.MAX_VALUE) {
                res.add(matrix[r][c]);
                matrix[r][c] = Integer.MAX_VALUE;
                r++;
                i++;
            }
            r--;
            c--;
            while (c >= 0 && matrix[r][c] != Integer.MAX_VALUE) {
                res.add(matrix[r][c]);
                matrix[r][c] = Integer.MAX_VALUE;
                c--;
                i++;
            }
            c++;
            r--;
            while (r >= 0 && matrix[r][c] != Integer.MAX_VALUE) {
                res.add(matrix[r][c]);
                matrix[r][c] = Integer.MAX_VALUE;
                r--;
                i++;
            }
            r++;
            c++;


        }

        return res;

    }
}
