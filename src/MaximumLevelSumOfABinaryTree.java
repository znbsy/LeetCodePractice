import java.util.*;


public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        List<Integer> compute = new ArrayList<>();
        dfs(root, compute, 1);
        System.out.println(compute.toString());

        int max = Integer.MIN_VALUE;
        int lev = Integer.MAX_VALUE;

        for (int i = 0; i < compute.size(); i++) {
            int v = compute.get(i);
            if (v > max) {
                lev = i;
                max = v;
            } else if (v == max) {
                if (lev > i) {
                    lev = i;
                }
            }
        }
        System.out.println(max);
        return lev + 1;

    }

    public void dfs(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }

        if (level <= list.size()) {
            list.set(level - 1, root.val + list.get(level - 1));
        } else {
            list.add(root.val);
        }
        dfs(root.left, list, level + 1);
        dfs(root.right, list, level + 1);
    }
}
