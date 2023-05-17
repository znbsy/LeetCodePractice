import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        int count = 1;
        Node curr;
        List<Node> queue = new ArrayList<>();
        queue.add(root);

        while (queue.size() != 0) {
            curr = queue.remove(0);
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.left != null) {
                queue.add(curr.right);
            }
            double test = Math.log(count + 1) / Math.log(2);
            if (test == (int) test) {
                curr.next = null;
            } else {
                curr.next = queue.get(0);
            }
            count++;
        }

        return root;
    }




}
