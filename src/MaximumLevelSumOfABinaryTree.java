import java.util.*;


public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {

        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> level = new HashMap<>();
        Map<TreeNode, Integer> map = new HashMap<>();



        queue.add(root);
        map.put(root, 1);
        level.put(1, root.val);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr.left != null) {
                int next = map.get(curr) + 1;
                queue.add(curr.left);
                map.put(curr.left, next);
                level.put(next, level.getOrDefault(next, 0) + curr.left.val);

            }
            if (curr.right != null) {
                int next = map.get(curr) + 1;
                queue.add(curr.right);
                map.put(curr.right, next);
                level.put(next, level.getOrDefault(next, 0) + curr.right.val);
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (var e: level.entrySet()) {
            int v = e.getValue();
            int k = e.getKey();
            if (v >= max && k < ans) {
                max = v;
                ans = k;
            }
        }

        return ans;

    }
}
