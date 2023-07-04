public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            int curVal;
            int preVal = Integer.MAX_VALUE;

            while (curr != null) {
                curVal = curr.val;
                if (curVal == preVal) {
                    ListNode temp = curr;
                    curr = curr.next;
                    if (curr == null) {
                        prev.next = curr;
                    }
                    temp.next = null;

                } else {
                    if (prev != null) {
                        prev.next = curr;
                    }
                    prev = curr;
                    curr = curr.next;
                    preVal = prev.val;
                }



            }

            return head;
    }

    public static void main(String[] args) {

        //ListNode l3 = new ListNode(2);
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(2, l2);
        ListNode l0 = new ListNode(1, l1);

        System.out.println(deleteDuplicates(l0));

    }
}
