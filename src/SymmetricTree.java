public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null){
            return true;
        }

        return areSymmetric(left, right);
    }
    public  boolean areSymmetric(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }

        if (root1 == null || root2 == null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }

        return areSymmetric(root1.left, root2.right) && areSymmetric(root1.right, root2.left);
    }
}
