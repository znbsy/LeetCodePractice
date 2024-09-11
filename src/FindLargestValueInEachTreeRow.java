import java.util.*;

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        helper(root, ans, 1);

        return ans;

    }

    public void helper(TreeNode root, List<Integer> list, int lev) {
        if (root == null) return;

        if (list.size() < lev) {
            list.add(root.val);

        } else {
            if (list.get(lev - 1) < root.val) {
                list.set(lev - 1, root.val);
            }
        }

        helper(root.left, list, lev + 1);
        helper(root.right, list, lev + 1);

    }
}
