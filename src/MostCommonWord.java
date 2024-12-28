import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] para = paragraph.split("[\\s!?',;.]+");
        Map<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>();
        for (var s: banned) {
            ban.add(s);
        }

        for (String s : para) {
            if (!s.isEmpty()) {
                String temp = s.toLowerCase();
                if (!ban.contains(temp)) {
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                }
            }
        }


        int count = 0;
        String word = "";

        for (var e: map.entrySet()) {
            String key = e.getKey();
            int val = e.getValue();
            if (val > count) {
                count = val;
                word = key;
            }
        }
        return word;

    }
}
