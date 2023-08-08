class Solution {
    boolean flag = true;
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }
    public boolean helper(String s, int left, int right) {
        if (left == right) {
            return true;
        }
        char first = s.charAt(left);
        char last = s.charAt(right);
        if (left + 1 == right) {
            if (first == last) {
                return true;
            } else{
                return flag;
            }
        }
        while (left <= right && first == last) {
            if (left == right) {
                return true;
            }
            if (left + 1 == right) {
                return true;
            }
            left++;
            right--;
            first = s.charAt(left);
            last = s.charAt(right);
        }

        if (flag) {
            flag = false;
            return helper(s, left + 1, right)
                    || helper(s,left, right - 1);
        } else {
            return false;
        }


    }
}
