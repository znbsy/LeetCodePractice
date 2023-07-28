import java.util.Stack;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int count = 0;
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop() * Math.pow(2, count);
            count++;
        }
        return res;
    }
}
