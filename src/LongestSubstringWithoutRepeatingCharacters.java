import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        Set<Character> charSet = new HashSet<>();
        int count = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (charSet.contains(curr)) {
                Character find;
                do {
                    find = s.charAt(left);
                    charSet.remove(find);
                    left++;
                } while (!find.equals(curr));
                charSet.add(curr);


            } else {
                charSet.add(curr);
            }
            count = Math.max(count, i - left + 1);
        }

        return count;
    }
}
