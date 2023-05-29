import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        helper(root, ans);

        return ans;
    }
    public void helper(TreeNode root, List<Integer> rec) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            helper(root.left, rec);
        }

        rec.add(root.val);

        if (root.right != null) {
            helper(root.right, rec);
        }

    }
}
