import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> part = new ArrayList<>();
        helper(n, k, 1, part, result);
        return  result;
    }

    public void helper(int n, int k, int start, List<Integer> part, List<List<Integer>> result) {
        if (part.size() == k) {
            result.add(new ArrayList<>(part));
            return;
        }

        for (int i = start; i <= n; i++) {
            part.add(i);
            helper(n, k, i + 1, part, result);
            part.remove(part.size() - 1);
        }

    }

}
