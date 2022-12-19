public class IsSubsequence {
    public static void main(String[] args) {
        String s1 = "aaa";
        String t1 = "bbavaa";
        System.out.println(isSubsequence(s1,t1));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        int idx = t.indexOf(s.charAt(0));
        if(idx == -1){
            return false;
        }
        else{
            return isSubsequence(s.substring(1),t.substring(idx + 1));
        }
    }
}
