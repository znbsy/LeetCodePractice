
public class PalindromeNumber {
    public  static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(-121));

    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int length = str.length();
        for(int i = 0; i < length / 2; i++){
            if(!str.substring(i,i+1).equals(str.substring(length - i - 1,length - i))){
                return false;
            }
        }
        return true;
    }

}
