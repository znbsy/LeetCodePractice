import java.util.*;
public class OddStringDifference {
    public String oddString(String[] words) {

        int[] curr = helper(words[0]);
        int[] diff = null;
        int wrong = -1;
        boolean flag = false;

        for (int i = 1; i < words.length; i++) {
            int[] temp = helper(words[i]);
            if (Arrays.compare(curr, temp) == 0) {
                if (flag) {
                    return words[wrong];
                }
            } else {
                if (!flag) {
                    diff = temp;
                    wrong = i;
                    flag = true;
                } else {
                    return words[0];
                }


            }
        }
        return words[wrong];


    }

    public int[] helper(String word) {
        int n = word.length();
        int[] arr = new int[n - 1];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = word.charAt(i) - word.charAt(i - 1);
        }
        return arr;
    }
}
