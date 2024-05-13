import java.util.*;

public class CombinationSumIII {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        Set<Integer> used = new HashSet<>();

        bt(new ArrayList<>(), 1, k, n);
        return ans;

    }

    public void bt(List<Integer> curr, int idx, int k, int n) {

        if (0 == k && n == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (idx == k && n < 0) {
            return;
        }

        for (int i = idx; i <= 9; i++) {
            if (n - i >= 0) {
                curr.add(i);
                bt(curr, i + 1, k - 1, n - i);
                curr.remove(Integer.valueOf(i));
            }
        }


    }
}
