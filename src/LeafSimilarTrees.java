import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return this.findLeaf(root1).equals(this.findLeaf(root2));
    }
    private List<Integer> findLeaf(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root.left == null && root.right == null){
            list.add(root.val);
            return list;
        }
        if(root.left != null){
            list.addAll(this.findLeaf(root.left));
        }
        if(root.right != null){
            list.addAll(this.findLeaf(root.right));
        }
        return list;
    }
}
