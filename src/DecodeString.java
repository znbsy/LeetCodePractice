import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] w = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : w) {
            if (c == ']') {
                // Process characters within brackets
                StringBuilder temp = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    temp.insert(0, stack.pop());
                }
                // Remove the opening bracket
                stack.pop();

                // Extract the number of repetitions
                int count = 0;
                int num = 0;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num += (stack.pop() - '0') * Math.pow(10, count);
                    count++;
                }

                // Repeat the decoded string and push it back to the stack
                String repeatedStr = temp.toString().repeat(Math.max(0, num));
                for (char ch : repeatedStr.toCharArray()) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }

        // Build the result from the stack
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();

    }
}
