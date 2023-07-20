import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = helper(n);

        if (n == 1) {
            return true;
        }

        while (slow != fast) {
            if (slow == 1 || fast == 1) {
                return true;
            }
            slow = helper(slow);
            fast = helper(helper(fast));
        }
        return false;
    }

    public int helper(int n) {
        int k = 0;
        while (n != 0) {
            k += (n % 10) * (n % 10);
            n /= 10;
        }
        return k;
    }
}
