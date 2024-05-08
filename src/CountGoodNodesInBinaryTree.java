public class CountGoodNodesInBinaryTree {
    int count = 0;

    public int goodNodes(TreeNode root) {

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left != null) {
            helper(root.left, root.val);
        }

        if (root.right != null) {
            helper(root.right, root.val);
        }

        return count + 1;

    }

    public void helper (TreeNode root, int max) {

        if (root.val >= max) {
            max = root.val;
            count++;
        }

        if (root.left != null) {
            helper(root.left, max);
        }

        if (root.right != null) {
            helper(root.right, max);
        }



    }
}
