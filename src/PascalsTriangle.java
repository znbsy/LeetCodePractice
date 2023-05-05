import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            pas.add(new ArrayList<>());
            pas.get(i).add(1);
            for (int j = 1; j <= i - 1; j++) {
                pas.get(i).add(0);
            }
            if (i != 0) {
                pas.get(i).add(1);
            }
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                pas.get(i).set(j, pas.get(i - 1).get(j) + pas.get(i - 1).get(j - 1));
            }
        }
        return pas;
    }
}
