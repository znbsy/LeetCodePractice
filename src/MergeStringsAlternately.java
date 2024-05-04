public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";

        int s1 = word1.length();
        int s2 = word2.length();

//        s2 is greater
        boolean flag = s1 < s2;
        int s0 = Math.min(s1, s2);

        for (int i = 0; i < s0; i++) {
            ans = ans + word1.charAt(i) + word2.charAt(i);
        }

        if (flag) {
            ans += word2.substring(s0);
        } else {
            ans += word1.substring(s0);
        }
        return ans;

    }
}
