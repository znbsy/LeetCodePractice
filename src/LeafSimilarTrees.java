import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();
        findSeq(root1, seq1);
        findSeq(root2, seq2);
        return Arrays.equals(seq1.toArray(), seq2.toArray());
    }

    public void findSeq(TreeNode root, List<Integer> l) {

        if (root.left == null && root.right == null) {
            l.add(root.val);
            return;
        }

        if (root.left != null) {
            findSeq(root.left, l);
        }

        if (root.right != null) {
            findSeq(root.right, l);
        }

    }
}
