import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {

        Map<String, Integer> row = new HashMap<>();
        Map<String, Integer> col = new HashMap<>();
        int ans = 0;

        for (var r : grid) {
            String rowString = Arrays.toString(r);
            if (row.containsKey(rowString)) {
                row.put(rowString, row.get(rowString) + 1);
            } else {
                row.put(rowString, 1);
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            int[] c = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                c[j] = grid[j][i];
            }
            String colString = Arrays.toString(c);
            if (col.containsKey(colString)) {
                col.put(colString, col.get(colString) + 1);
            } else {
                col.put(colString, 1);
            }
        }

        for (var e1 : row.entrySet()) {
            String k1 = e1.getKey();
            int v1 = e1.getValue();

            if (col.containsKey(k1)) {
                ans += v1 * col.get(k1);
            }
        }

        return ans;


    }
}
