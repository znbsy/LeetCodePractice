import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        List<Character> stack = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                stack.add(temp);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if ((temp == ')' && stack.remove(stack.size() - 1) != '(')
                        || (temp == ']' && stack.remove(stack.size() - 1) != '[')
                        || (temp == '}' && stack.remove(stack.size() - 1) != '{')) {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
