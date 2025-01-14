import java.util.*;
public class ThekthFactorofn {
    public int kthFactor(int n, int k) {
        int pt = 0;
        double sqrt = Math.sqrt(n);
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                pt++;
                if (pt == k) {
                    return i;
                }
                temp.add(i);
            }
        }
        int count = (sqrt == Math.floor(sqrt)) ? 2 * (pt - 1) + 1 : 2 * pt;
        if (k > count) return -1;

        return n / (temp.get(count - k));
    }
}
