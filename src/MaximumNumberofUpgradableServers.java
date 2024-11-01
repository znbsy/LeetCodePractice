import java.util.*;
public class MaximumNumberofUpgradableServers {
    public int[] maxUpgrades(int[] count, int[] upgrade, int[] sell, int[] money) {
        int n = count.length;
        int[] r = Arrays.copyOf(count, n);

        for (int i = 0; i < n; i++) {
            long temp = (long) count[i] * upgrade[i] - money[i];

            if (temp > 0) {
                int v = sell[i] + upgrade[i];
                r[i] -= (int) ((temp + v - 1) / v);
            }
        }

        return r;
    }
}
