import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] w = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (var c: w) {
            if (c - '0' >= 0 && c - '0' <= 9
                    || c - 'a' >= 0 && c - 'a' <= 25
                    || c == '[') {
                stack.push(c);
            }

            if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while (true) {
                    char curr = stack.peek();
                    if (curr - '0' >= 0 && curr - '0' <= 9) {

                    } else if (curr - 'a' >= 0 && curr - 'a' <= 25) {
                        temp.append(curr);
                    }
                }
            }
        }

    }
}
