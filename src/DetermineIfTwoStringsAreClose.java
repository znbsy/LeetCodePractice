;import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();


        char[] freq1 = new char[26];
        char[] freq2 = new char[26];


        for (var a: w1) {
            freq1[a - 'a'] += 1;
        }

        for (var a: w2) {
            freq2[a - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);



    }
}
