import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    Map<Character, Set<Character>> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {


        map.put('2', Set.of('a', 'b', 'c'));
        map.put('3', Set.of('d', 'e', 'f'));
        map.put('4', Set.of('h', 'i', 'g'));
        map.put('5', Set.of('k', 'l', 'j'));
        map.put('6', Set.of('m', 'n', 'o'));
        map.put('7', Set.of('p', 'q', 'r', 's'));
        map.put('8', Set.of('t', 'u', 'v'));
        map.put('9', Set.of('w', 'x', 'y', 'z'));


        List<String> ans = new ArrayList<>();
        bt(ans, "", digits, 0);
        return ans;

    }

    public void bt(List<String> ans, String curr, String digit, int idx) {
        if (idx == digit.length()) {
            if (curr.equals("")) {
                return;
            }
            ans.add(curr);
            return;
        }

//        for (int i = idx; i < digit.length(); i++) {
            for (var c: map.get(digit.charAt(idx))) {
                String temp = curr;
                temp += c;
                bt(ans, temp, digit, idx + 1);

            }
//        }

    }
}
