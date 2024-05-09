public class LowestCommonAncestorOfABinaryTree {

    TreeNode prev;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        check(root, p, q);

        return prev;


    }

    public void check (TreeNode root, TreeNode p , TreeNode q) {

        boolean left = helper(root.left, p) && helper(root.left, q);
        boolean right = helper(root.right, p) && helper(root.right,q);



        if (!left && !right) {
            prev = root;
        } else if (right) {
            check(root.right, p, q);
        } else {
            check(root.left, p, q);
        }


    }

    public boolean helper (TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }

        if (root.left == p || root.right == p || root == p) {
            return true;
        }

        return helper(root.left, p) || helper(root.right, p);
    }
}
