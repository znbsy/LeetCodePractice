public class FlattenAMultilevelDoublyLinkedList {
    public static Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        if (head.child == null) {
            flatten(head.next);
        } else {
            Node temp = head.next;
            head.next = head.child;
            head.child = null;
            flatten(head.next);
            Node curr = head.next;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = flatten(temp);
            temp.prev = curr;
        }

        System.out.println(head.val);
        return head;
    }

    public static void main(String[] args) {
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n1 = new Node(1);
        n3.prev = null;
        n2.prev = n1;
        n1.prev = null;
        n1.next = n2;
        n2.next = null;
        n3.next = null;
        n1.child = n3;
        System.out.println(flatten(n1));
    }
}
