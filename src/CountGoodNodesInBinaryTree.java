public class CountGoodNodesInBinaryTree {

    public int pathSum(TreeNode root, int targetSum) {
        int count = 0;
        if(root == null) return 0;
        count += helper(root, targetSum, 0);
        count += pathSum(root.left, targetSum)+ pathSum(root.right, targetSum);
        return count;

    }

    public int helper(TreeNode root, int targetSum, int sum) {
        int count = 0;
        if (root == null) {
            return 0;
        }

        sum += root.val;
        if (sum == targetSum) {
            count++;
        }

        count += helper(root.left, targetSum, sum);
        count += helper(root.right, targetSum, sum);

        return count;


    }
}
