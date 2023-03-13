public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for (int i = 0; i < first.length(); i++){
            for (String str : strs){
                if (str.equals("")){
                    return "";
                }
                if (i + 1 > str.length() || str.charAt(i) != first.charAt(i)){
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
