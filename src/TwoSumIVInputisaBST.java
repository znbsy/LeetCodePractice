import java.util.*;
public class TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return false;



    }

    public void helper(List<Integer> list, TreeNode root) {
        if (root == null) return;

        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);

    }
}
