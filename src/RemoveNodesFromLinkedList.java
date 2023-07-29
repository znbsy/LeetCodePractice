public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode next = removeNodes(head.next);
        if (head.val < next.val) {
            head.next = null;
            System.gc();
            return next;
        } else {
            head.next = next;
            return head;
        }
    }
}
