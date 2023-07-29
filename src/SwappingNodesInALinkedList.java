public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int idx = 1;
        ListNode begin = head;
        while (curr != null) {
            if (idx == k) {
                begin = curr;
            }
            curr = curr.next;
            idx++;
        }
        int count = idx - k - 1;
        curr = head;
        while (count != 0) {
            curr = curr.next;
            count--;
        }

        int temp = begin.val;
        begin.val = curr.val;
        curr.val = temp;
        return head;
    }
}
