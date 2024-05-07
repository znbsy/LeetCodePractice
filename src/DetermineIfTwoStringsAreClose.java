;import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        if (Arrays.equals(w1, w2)) {
            return true;
        }

        Map<Character, Integer> m1 = new HashMap<>();

        for (var a: w1) {
            m1.put(a, m1.getOrDefault(a, 0) + 1);
        }

        Map<Character, Integer> m2 = new HashMap<>();

        for (var a: w2) {
            m2.put(a, m2.getOrDefault(a, 0) + 1);
        }

        List<Integer> m1ValuesSorted = new ArrayList<>(m1.values());
        List<Integer> m2ValuesSorted = new ArrayList<>(m2.values());
        Collections.sort(m1ValuesSorted);
        Collections.sort(m2ValuesSorted);

        return m1ValuesSorted.equals(m2ValuesSorted) &&
                new HashSet<>(m1.keySet()).equals(new HashSet<>(m2.keySet()));



    }
}
