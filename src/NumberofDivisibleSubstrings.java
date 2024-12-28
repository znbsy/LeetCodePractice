public class NumberofDivisibleSubstrings {
    int[] map = new int[]{1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9};

    public int countDivisibleSubstrings(String word) {
        int count = 0;
        int n = word.length();
        int[] prefixsum = new int[n];
        prefixsum[0] =  map[word.charAt(0) - 'a'];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + map[word.charAt(i) - 'a'];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum;

                if (i == 0) {
                    sum = prefixsum[j];
                } else {
                    sum = prefixsum[j] - prefixsum[i - 1];
                }


                count += sum % (j - i + 1) == 0 ? 1: 0;

            }
        }

        return count;
    }
}
