public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        int num = head.val;
        ListNode curr = head.next;

        while (curr != null && curr.val == num) {
            curr = curr.next;
        }

        if (head.next != curr) {
            head = curr;
            return deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(curr);
            return head;

        }

    }
}
