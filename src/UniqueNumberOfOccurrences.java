import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var a: arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        Set<Integer> set = new HashSet<>();

        for (var v: map.values()) {
            if (set.contains(v)) {
                return false;
            } else {
                set.add(v);
            }
        }

        return true;
    }
}
