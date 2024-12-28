public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {

                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i <= 2 || dp[i + 1][j - 1]);

                if (dp[i][j] && j - i > end - start) {
                    start = i;
                    end = j;
                    if (end - start == s.length()) {
                        return s;
                    }
                }
            }
        }


        return s.substring(start, end + 1);





    }
}
