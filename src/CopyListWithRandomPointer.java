import java.util.*;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

        // Create a mapping from original nodes to their copies
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        // First pass: create all nodes with next pointers and store in map
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Second pass: assign next and random pointers
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);



    }


}
