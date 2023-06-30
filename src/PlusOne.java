public class PlusOne {
    public int[] plusOne(int[] digits) {
        int curr = (digits[digits.length - 1] + 1) % 10;
        int add = (digits[digits.length - 1] + 1) / 10;
        digits[digits.length - 1] = curr;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (add == 0) {
                break;
            }
            curr = (digits[i] + add) % 10;
            add = (digits[i] + add) / 10;
            digits[i] = curr;
        }
        if (add != 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, ans.length - 1);
            return ans;
        }
        return digits;
    }
}
