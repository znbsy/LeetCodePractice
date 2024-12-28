import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, ans, "");
        return ans;
    }

    public void helper(int left, int right, List<String> ans, String curr) {
        if (left == 0 && right == 0) {
            ans.add(curr);
            return;
        }
        if (left > 0) {
            helper(left - 1, right, ans, curr + "(");
        }
        if (right > left && right > 0) {
            helper(left, right - 1, ans, curr + ")");
        }

    }
}
