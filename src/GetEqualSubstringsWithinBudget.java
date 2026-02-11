public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i) - t.charAt(i));
            while (sum > maxCost) {
                sum -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            ans = Math.max(ans, i - left + 1);

        }
        return ans;
    }
    public static void main(String[] args) {
        GetEqualSubstringsWithinBudget obj = new GetEqualSubstringsWithinBudget();
        System.out.println(obj.equalSubstring("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14));
    }
}
