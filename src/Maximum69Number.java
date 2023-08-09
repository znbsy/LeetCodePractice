public class Maximum69Number {
    public int maximum69Number (int num) {
        int exp = 0;
        int most = -1;
        int ans = num;

        while (num != 0) {
            if (num % 10 == 6) {
                most = exp;
            }
            exp++;
            num /= 10;
        }
        return ans == -1 ? ans : (int)(ans + 3 * Math.pow(10, most));
    }
}
