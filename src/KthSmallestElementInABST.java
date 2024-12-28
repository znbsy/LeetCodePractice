public class KthSmallestElementInABST {
    int count = 0;
    int target = Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return target;
    }


    public void helper(TreeNode root, int k) {
        if (target != Integer.MAX_VALUE) {
            return;
        }
        if (root == null) return;

        helper(root.left, k);

        if (target != Integer.MAX_VALUE) {
            return;
        }


        //System.out.println(root.val);
        count++;

        if (count == k) {
            target = root.val;
            return;
        }

        helper(root.right, k);

    }
}
