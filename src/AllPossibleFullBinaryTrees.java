import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPossibleFullBinaryTrees {
    public static List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> tree = new ArrayList<>();
        if (n == 1) {
            tree.add(new TreeNode(0));
            return tree;
        }
        if (n % 2 == 0) {
            return tree;
        }

        for (int i = 1; i < n - 1; i = i + 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);
            for (TreeNode t: left) {
                for (TreeNode r: right) {
                    TreeNode root = new TreeNode(0);
                    root.left = t;
                    root.right = r;
                    tree.add(root);
                }
            }
        }


        return tree;

    }



    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        int d = 7;
        int e = 9;
        System.out.println(allPossibleFBT(a));
        System.out.println(allPossibleFBT(b));
        System.out.println(allPossibleFBT(c));
        System.out.println(allPossibleFBT(d));
        System.out.println(allPossibleFBT(e));

    }
}
