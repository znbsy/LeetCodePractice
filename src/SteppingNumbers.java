import java.util.*;

public class SteppingNumbers {
    public List<Integer> countSteppingNumbers(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            dfs(low, high, i, ans);
        }

        Collections.sort(ans);

        return ans;

    }

    public void dfs(int low, int high, long curr, List<Integer> list) {
        if (curr >= low && curr <= high) {
            list.add((int)curr);
        }

        if (curr == 0 || curr > high) return;

        long last = curr % 10;
        long inc = curr * 10 + 1 + last;
        long dec = curr * 10 - 1 + last;

        if (last == 0) {
            dfs(low, high, inc, list);
        } else if (last == 9) {
            dfs(low, high, dec, list);
        } else {
            dfs(low, high, inc, list);
            dfs(low, high, dec, list);
        }






    }
}
