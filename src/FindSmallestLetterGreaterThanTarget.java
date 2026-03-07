public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target && ( (mid == 0) || letters[mid - 1] <= target)) {
                return letters[mid];
            } else if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        int a = letters[0];
        System.out.println(a);
        return letters[0];
    }
    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        System.out.println(f.nextGreatestLetter(new char[]{'a', 'b', 'c'}, 'z'));
    }
}
