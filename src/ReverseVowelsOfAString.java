import java.util.*;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] w = s.toCharArray();

        Set<Character> check = new HashSet<>();
        check.add('a');
        check.add('e');
        check.add('i');
        check.add('o');
        check.add('u');
        check.add('A');
        check.add('E');
        check.add('I');
        check.add('O');
        check.add('U');

        List<Integer> record = new ArrayList<>();


        for (int i = 0; i < w.length; i++) {
            if (check.contains(w[i])) {
                record.add(i);
            }
        }

        int begin = 0;
        int end = record.size() - 1;
        while (begin <= end) {

            char temp = w[record.get(begin)];
            w[record.get(begin)] = w[record.get(end)];
            w[record.get(end)] = temp;

            begin++;
            end--;
        }

        return String.valueOf(w);

    }
}
