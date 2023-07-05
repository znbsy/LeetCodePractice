public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = minDepth(root.left);
        int b = minDepth(root.right);

        if (a == 0 && b == 0) {
            return 1;
        }

        if (a == 0) {
            return 1 + b;
        }
        if (b == 0) {
            return 1 + a;
        }

        return 1 + Math.min(a, b);
    }

    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(7);
        TreeNode t3 = new TreeNode(15);
        TreeNode t2 = new TreeNode(20, t3, t4);
        TreeNode t1 = new TreeNode(9);
        TreeNode t0 = new TreeNode(3, t1, t2);

        System.out.println(minDepth(t0));
    }
}
