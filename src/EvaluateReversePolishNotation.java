import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int op2 = stack.pop();
                    int op1 = stack.pop();
                    stack.push(op1 + op2);


                }
                case "-" -> {
                    int op2 = stack.pop();
                    int op1 = stack.pop();
                    stack.push(op1 - op2);

                }
                case "*" -> {
                    int op2 = stack.pop();
                    int op1 = stack.pop();
                    stack.push(op1 * op2);

                }
                case "/" -> {
                    int op2 = stack.pop();
                    int op1 = stack.pop();
                    stack.push(op1 / op2);

                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
