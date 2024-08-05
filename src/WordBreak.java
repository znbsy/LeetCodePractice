import java.util.*;
public class WordBreak {
    int[] mem;
    public boolean wordBreak(String s, List<String> wordDict) {
        mem = new int[s.length() + 1];
        mem[s.length()] = 1;
        return helper(s, wordDict, 0);
    }
    public boolean helper(String s, List<String> wordDict, int idx) {
        if (s.isEmpty()) return true;

        for (int j = 1; j <= s.length(); j++) {
            String sub = s.substring(0, j);

            if (wordDict.contains(sub)) {
                if (mem[idx + j] == 0) {
                    mem[idx + j] = helper(s.substring(j), wordDict, idx + j)? 1 : -1;
                }
                if (mem[idx + j] == 1) {
                    return true;
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        //System.out.println(wordBreak.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
        System.out.println(wordBreak.wordBreak("leetcode", Arrays.asList("leet","code")));
    }
}
