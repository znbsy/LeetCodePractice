import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] r = new int[26];
        int[] m = new int[26];

        for(var c: ransomNote.toCharArray()) {
            r[c - 'a']++;
        }
        for(var c: magazine.toCharArray()) {
            m[c - 'a']++;
        }


        for (int i = 0; i < 26; i++) {
            if (m[i] < r[i]) {
                return false;
            }
        }

        return true;
    }
}
