public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return head;
        }
        int count = 1;
        ListNode copy = head;
        while (copy.next != null){
            copy = copy.next;
            count++;
        }
        ListNode prev = null;
        copy = head;
        for (int i = 0 ; i < count - n; i++){
            prev = copy;
            copy = copy.next;
        }
        if (prev == null){
            return copy.next;
        }
        else {
            prev.next = copy.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        //System.out.println(removeNthFromEnd(l1, 2).val);

        ListNode s1 = new ListNode(1, null);
        System.out.println(removeNthFromEnd(s1, 1).val);

    }
}
