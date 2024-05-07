import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (var a: asteroids) {
            if (a >= 0) {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    stack.push(a);
                } else {
                    while (true) {
                        int left = stack.peek();
                        if (left <= 0) {
                            stack.push(a);
                            break;
                        } else {
                            if (left + a < 0) {
                                stack.pop();
                                if (stack.isEmpty()) {
                                    stack.push(a);
                                    break;
                                }
                            } else if (left + a == 0) {
                                stack.pop();
                                break;
                            } else {
                                break;
                            }
                        }
                    }

                }


            }
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
