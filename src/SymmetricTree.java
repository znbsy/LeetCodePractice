public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null){
            return true;
        }

        return isSame(left, reversedTree(right));
    }
    public boolean isSame(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }

        if (root1 == null || root2 == null){
            return false;
        }

        if (root1.val != root2.val ){
            return false;
        }

        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
    public TreeNode reversedTree(TreeNode root){
        if (root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = reversedTree(root.right);
        root.right = reversedTree(temp);
        return root;
    }
}
