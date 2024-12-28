import java.util.*;
public class CountVowelSubstringsofaString {
    public int countVowelSubstrings(String word) {
        Map<Character, Integer> map = new HashMap<>(Map.of('a',-1,'e',-1, 'i', -1, 'o', -1, 'u', -1 ));
        int count = 0;
        int last = -1;

        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), i);
                count += Math.max(Collections.min(map.values()) - last, 0);
            } else {
                last = i;
            }
        }

        return count;
    }
}
