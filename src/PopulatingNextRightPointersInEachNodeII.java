import java.util.*;

public class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()) {
            int size = queue.size();
            int i = 0;

            while (i < size) {
                Node curr = queue.poll();
                if (curr == null) {
                    System.out.println("ssssssssssssssssssbbbbbbbbbbbb");
                } else {
                    if (i + 1 < size) {
                        curr.next = queue.peek();
                    }

                    if (curr.left != null) {
                        queue.add(curr.left);
                    }

                    if (curr.right != null) {
                        queue.add(curr.right);
                    }

                }
                i++;

            }
        }
        return root;
    }
}
