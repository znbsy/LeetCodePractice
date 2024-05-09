public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {

            if (root.right == null && root.left == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }

            TreeNode temp = findSucc(root.right);
            root.val = temp.val;

            root.right = deleteNode(root.right, temp.val);


        }

        return root;



    }

    public TreeNode findSucc(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


}
