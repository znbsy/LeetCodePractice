import java.util.Arrays;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] w = s.trim().split(" +");
        int begin = 0;
        int end = w.length - 1;

        while (begin <= end) {
            String temp = w[begin];
            w[begin] = w[end];
            w[end] = temp;

            begin++;
            end--;
        }

        String ans = "";

        for(var c:  w) {
            ans = ans + c + " ";
        }

        return ans.trim();
    }
}
