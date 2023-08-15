import java.util.Arrays;

public class CountSortedVowelStrings {
    public static int countVowelStrings(int n) {
        int[] arr = new int[]{1, 1, 1, 1, 1};

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    arr[j] += arr[k];
                }
            }
        }

        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(2));
    }
}
