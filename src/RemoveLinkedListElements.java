import com.sun.tools.javac.Main;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode a7 = new ListNode(6);
        ListNode a6 = new ListNode(5, a7);
        ListNode a5 = new ListNode(4, a6);
        ListNode a4 = new ListNode(3, a5);
        ListNode a3 = new ListNode(6, a4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);
        System.out.println(removeElements(a5, 6));

        ListNode b4 = new ListNode(7);
        ListNode b3 = new ListNode(7, b4);
        ListNode b2 = new ListNode(7, b3);
        ListNode b1 = new ListNode(7, b2);
        System.out.println(removeElements(b4, 7));
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if(head.val == val){
            return removeElements(head.next, val);
        }
        if(head.next == null){
            return head;
        }
        if(head.next.val == val){
            head.next = head.next.next;
        }
        head.next = removeElements(head.next, val);
        return head;

    }
}

/*
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
*/
