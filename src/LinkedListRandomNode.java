import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {
    List<Integer> list;
    public LinkedListRandomNode(ListNode head) {
        this.list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        int ran = (int)(Math.random() * this.list.size());
        return this.list.get(ran);
    }
}
