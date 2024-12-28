public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode();
        ListNode more = new ListNode();
        ListNode l = less;
        ListNode m = more;


        while (head != null) {
            if (head.val < x) {
                l.next = head;
                l = l.next;
            } else {
                m.next = head;
                m = m.next;
            }
            head = head.next;
        }

        m.next = null;
        l.next = more.next;

        return less.next;
    }

}
