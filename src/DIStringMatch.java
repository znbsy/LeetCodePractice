public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int great = s.length();
        int small = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                ans[i] = small;
                small++;
            } else {
                ans[i] = great;
                great--;
            }
        }
        ans[s.length()] = small;
        return ans;
    }
}
