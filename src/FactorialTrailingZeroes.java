public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {

        if (n <= 4) return 0;

        int exp = (int) (Math.log(n) / Math.log(5));
        int count = 0;

        for (int i = 1; i <= exp; i++) {
            count += (int) (n / Math.pow(5, i));
        }

        return count;

    }
}
