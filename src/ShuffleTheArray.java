public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int a = 0;
        for (int i = 0; i < n; i++) {
            ans[a] = nums[i];
            ans[a + 1] = nums[i + n];
            a += 2;
        }
        return ans;
    }
}
