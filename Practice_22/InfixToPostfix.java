package Practice_22;

import java.util.Stack;

public class InfixToPostfix {
    private static int getPriority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        else if (operator == '*' || operator == '/') {
            return 2;
        }
        else {
            return 0;
        }
    }
    public static String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix.append(c);
            }
            else {
                postfix.append(' ');

                while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            postfix.append(' ').append(stack.pop());
        }
        return postfix.toString();
    }
}
