public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) {
            return false;
        }

        do {
            if (slow.next == null) {
                return false;
            }
            slow = slow.next;

            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;

        } while (slow != fast);
        return true;
    }
}
