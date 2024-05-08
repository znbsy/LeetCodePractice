public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode prev = null;
        ListNode fast = head;

        if (slow.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        prev.next = slow.next;

        return head;
    }
}
