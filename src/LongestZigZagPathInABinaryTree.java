public class LongestZigZagPathInABinaryTree {
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] result = new int[1]; // Array to store the result

        dfs(root.left, false, 1, result); // Explore left subtree
        dfs(root.right, true, 1, result); // Explore right subtree

        return result[0];
    }

    private void dfs(TreeNode node, boolean isRightChild, int length, int[] result) {
        if (node == null) {
            return;
        }

        // Update result with the current length if it's greater
        result[0] = Math.max(result[0], length);

        // Explore the opposite direction from the current node
        dfs(isRightChild ? node.left : node.right, !isRightChild, length + 1, result);

        // Explore the same direction from the current node
        dfs(isRightChild ? node.right : node.left, isRightChild, 1, result);
    }
}
