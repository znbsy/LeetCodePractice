public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(!fast.equals(slow)){
            if(fast.next == null || fast.next.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode slow2 = head;
        while (slow2 != slow){
            slow2 = slow2.next;
            slow = slow.next;
        }
        return slow;
    }
}


