import java.util.*;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int i = 1;
            double sum = 0.0;
            while (i <= size) {
                TreeNode curr = q.poll();
                sum += curr.val;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                i++;
            }
            ans.add(sum / size);
        }

        return ans;
    }
}
