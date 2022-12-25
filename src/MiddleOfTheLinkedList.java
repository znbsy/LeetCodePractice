public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode twice = head.next;
        while (twice != null){
            current = current.next;
            if(twice.next != null){
                twice = twice.next.next;
            }
            else{
                break;
            }
        }
        return current;
    }
}
