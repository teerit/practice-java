import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String hello = "hello";
        System.out.println(reverseString(hello));
    }

    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
        for (Character s : str.toCharArray()) {
            stack.push(s);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}