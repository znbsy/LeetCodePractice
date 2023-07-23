import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return ans;
    }
    public void helper(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            s += "" + root.val;
            ans.add(s);
            return;
        }
        if (root.left != null) {
            helper(root.left, s + root.val + "->");
        }
        if (root.right != null) {
            helper(root.right, s + root.val + "->");
        }
    }
}
