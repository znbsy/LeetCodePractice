import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");

        if (pattern.length() != str.length) {
            return false;
        }

        for (int i = 0; i < str.length; i++) {
            char a = pattern.charAt(i);
            if (!map.containsKey(a)) {
                if (map.containsValue(str[i])) {
                    return false;
                }
                map.put(a, str[i]);
            } else {
                if (!map.get(a).equals(str[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }
}
