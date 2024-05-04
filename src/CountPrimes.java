import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        boolean[] t = new boolean[n];
        int ans = n - 2;

        for (int i = 2; i < n; i++) {
            if (t[i]) {
                continue;
            }
            int j = 2;
            while (i * j < n) {
                if (!t[i * j]) {
                    t[i * j] = true;
                    ans--;
                }

                j++;
            }
        }
        return ans;

    }
}
