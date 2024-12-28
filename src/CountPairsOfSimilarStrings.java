import java.util.*;
public class CountPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        Map<Set<Character>, Integer> map = new HashMap<>();
        int count = 0;

        for (var w: words) {
            Set<Character> temp = helper(w);
            if (map.containsKey(temp)) {
                int curr = map.get(temp);
                count += curr;
                map.put(temp, curr + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return count;

    }

    public Set<Character> helper(String word) {
        Set<Character> set = new HashSet<>();
        for (var c: word.toCharArray()) {
            set.add(c);
        }
        return set;

    }
}
