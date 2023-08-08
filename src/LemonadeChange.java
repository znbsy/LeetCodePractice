public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                f += 1;
            } else if (bills[i] == 10) {
                if (f == 0) {
                    return false;
                } else {
                    f -= 1;
                    t += 1;
                }
            } else {
                if (t >= 1 && f >= 1) {
                    f -= 1;
                    t -= 1;

                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
