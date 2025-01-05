import java.util.*;
public class ReverseWordsinaStringII {
    public void reverseWords(char[] s) {

        char[] arr = Arrays.copyOf(s, s.length);
        int left = 0;
        int right = arr.length - 1;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || i == arr.length - 1) {
                int end = (i == arr.length - 1) ? i : i - 1;
                for (int j = left; j <= end; j++) {
                    s[right - (end - j)] = arr[j];
                }

                if (i != arr.length - 1) {
                    s[right - (end - left + 1)] = ' ';
                }

                right = right - (end - left + 2);
                left = i + 1;
            }
        }
    }
}
