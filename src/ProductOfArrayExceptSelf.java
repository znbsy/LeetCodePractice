public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero = 0;

        for (var n: nums) {
            if (n == 0) {
                zero++;
            } else {
                product *= n;
            }

        }

        int[] ans = new int[nums.length];
        if (zero >= 2) {
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (zero == 1) {
                    ans[i] = 0;
                } else {
                    ans[i] = product / nums[i];
                }
            } else {
                ans[i] = product;
            }

        }

        return ans;
    }
}
