import java.util.*;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node prev;
    public Node next;
    public Node child;
    public Node random;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, Node _left, Node _right, Node _next, Node _prev, Node _child) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
        prev = _prev;
        child = _child;
        random = null;
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

}
