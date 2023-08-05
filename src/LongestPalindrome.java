import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean flag = false;
        for (char ch: c) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (Integer i: map.values()) {
            if (i % 2 == 0) {
                count = count + i;
            } else {
                flag = true;
                count = count + i - 1;
            }
        }
        return flag ? count + 1: count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
