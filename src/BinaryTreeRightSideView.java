import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        helper(root, ans, 1);
        return ans;


    }

    public void helper(TreeNode root, List<Integer> list, int lev) {
        if (root == null) {
            return;
        }

        if (lev > list.size()) {
            list.add(root.val);
        }

        helper(root.right, list, lev + 1);
        helper(root.left, list, lev + 1);


    }
}
