import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = (l + r) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        TreeNode left;
        TreeNode right;
        if (mid - 1 >= l) {
            left = sortedArrayToBST(Arrays.copyOfRange(nums, l, mid));
        } else {
            left = null;
        }
        if (mid + 1 <= r) {
            right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, r + 1));
        } else {
            right = null;
        }

        root.left = left;
        root.right = right;


        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3 ,0, 5, 9};
        System.out.println(sortedArrayToBST(nums));
    }

}
