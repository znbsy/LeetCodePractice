import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int count = 0;
        int bal = 0;
        char[] c = s.toCharArray();
        for (char a: c) {
            bal = a == 'L' ? bal - 1 : bal + 1;
            count = bal == 0 ? count + 1 : count;
        }
        return count;
    }
}
