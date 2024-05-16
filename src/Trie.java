import java.util.*;

public class Trie {
    List<String> s;

    public Trie() {
        s = new ArrayList<>();
    }

    public void insert(String word) {
        s.add(word);
    }

    public boolean search(String word) {
        for (var e: s) {
            if (e.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        for (var e: s) {
            if (e.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
