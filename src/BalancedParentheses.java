import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(c);
                    continue;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    continue;
                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(())";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
    }
}
