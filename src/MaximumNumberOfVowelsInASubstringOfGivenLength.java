import java.util.*;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        int count;
        var arr = new int[s.length()];
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < k; i++) {
            n += arr[i];
        }
        count = n;
        for (int i = k; i < s.length(); i++) {
            n = n + arr[i] - arr[i - k];
            count = Math.max(n, count);
            if (count == k) {
                return k;
            }
        }
        return count;
    }

    public static boolean isVowel (char single) {
        return switch (single) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}


