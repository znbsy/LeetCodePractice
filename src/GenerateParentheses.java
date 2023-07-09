import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    static List<String> ans = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        helper(n - 1, n, "(");
        return ans;
    }

    public static void helper(int op, int cl, String curr) {
        if (op == 0 && cl == 0) {
            ans.add(curr);
        }

        if (op == cl) {
            curr += "(";
            helper(op - 1, cl, curr);
        } else if (op == 0) {
            curr += ")";
            helper(op, cl - 1, curr);
        } else if (cl == 0 ) {
            return;
        } else {
            helper(op - 1, cl, curr + "(");
            helper(op, cl - 1, curr + ")");
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
