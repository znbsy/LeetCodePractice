import java.util.*;

public class LuckyNumbersinaMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            row.add(min);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int max = 0;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            col.add(max);
        }
        row.retainAll(col);
        return new ArrayList<>(row);


    }
}
