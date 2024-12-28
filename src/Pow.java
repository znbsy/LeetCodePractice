public class Pow {
    public double myPow(double x, int n) {
        if (n == 1) return x;

        boolean negative = n < 0;
        long m = n;
        m = negative? -m: m;
        double ans = 1.0;

        while (m > 0) {
            if (m % 2 == 1) {
                ans *= x;
                m--;
            } else {
                x *= x;
                m /= 2;
            }
        }


        if (negative) ans = 1.0 / ans;

        return ans;


    }
}
