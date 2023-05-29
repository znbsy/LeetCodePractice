public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int result = helper(root.right) - helper(root.left);
        return  result <= 1 && result >= -1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = helper(root.left) + 1;
        int rh = helper(root.right) + 1;


        return Math.max(lh, rh);

    }
}
