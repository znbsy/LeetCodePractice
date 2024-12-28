import java.util.*;

public class SumRootToLeafNumbers {
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return ans;
    }


    public void helper(TreeNode root, int sum) {
        if (root == null) return;

        if (root.left == null && root.right == null) ans += sum * 10 + root.val;


        helper(root.left, sum * 10 + root.val);
        helper(root.right, sum * 10 + root.val);
    }
}
