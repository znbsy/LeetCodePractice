import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        helper(root, lst);

        return  lst;
    }

    public void helper(TreeNode root, List<Integer> lst) {
        if (root == null) {
            return;
        }

        lst.add(root.val);

        helper(root.left, lst);
        helper(root.right, lst);

    }
}
