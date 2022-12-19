import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(mapping.containsKey(s.charAt(i))){
                if(!mapping.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else{
                if(mapping.containsValue(t.charAt(i))){
                    return false;
                }
                else{
                    mapping.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }
}
