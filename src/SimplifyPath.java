import java.util.Iterator;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {

        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int len = path.length();
        int i = 0;

        while (i < len) {
            // Skip multiple '/'.
            while (i < len && path.charAt(i) == '/') {
                i++;
            }
            // Find the next component.
            int start = i;
            while (i < len && path.charAt(i) != '/') {
                i++;
            }
            if (start == i) {
                continue;
            }
            String part = path.substring(start, i);
            // Handle ".." to pop the stack.
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals(".")) {
                stack.push(part);
            }
        }

        for (String dir : stack) {
            sb.append('/');
            sb.append(dir);
        }

        return !sb.isEmpty() ? sb.toString() : "/";
    }
}
