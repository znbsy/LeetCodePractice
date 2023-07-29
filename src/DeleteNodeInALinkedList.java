public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
                System.gc();
                return;
            }
            node = node.next;
        }
        System.gc();
    }
}
