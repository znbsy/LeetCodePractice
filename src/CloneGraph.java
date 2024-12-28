import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        return helper(node, map);
    }

    public Node helper(Node node, Map<Integer, Node> map) {
        if (node == null) return null;

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        Node newNode = new Node(node.val);
        map.put(newNode.val, newNode);
        List<Node> children = new ArrayList<>();

        for (Node child : node.neighbors) {
            children.add(helper(child, map));
        }
        newNode.neighbors = children;

        return newNode;

    }
}
