import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        helper(root, lst);

        return  lst;
    }

    public void helper(TreeNode root, List<Integer> lst) {
        if (root == null) {
            return;
        }
        helper(root.left, lst);
        helper(root.right, lst);
        lst.add(root.val);

    }
}
