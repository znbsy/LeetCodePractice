import java.util.*;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(!map.containsKey(curr)) {
                map.put(curr,i);
            } else {
                map.put(curr, Integer.MAX_VALUE);
            }
        }
        int k = Integer.MAX_VALUE;
        for (Integer i: map.values()) {
            k = Math.min(k, i);
        }



        return k == Integer.MAX_VALUE? -1: k;


    }
}
