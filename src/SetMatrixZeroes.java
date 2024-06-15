import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    cols.add(j);
                    rows.add(i);
                }
            }
        }

        for (var row : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        for (var col : cols) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }

    }
}
