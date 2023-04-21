package day15.baicuangu;

import java.util.Stack;

public class Parentheses {
    public static boolean checkParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String parentheses1 = "()(()())()";
        String parentheses2 = "()()()(";
        System.out.println("Chuỗi 1 trả về: " +checkParentheses(parentheses1));
        System.out.println("Chuỗi 2 trả về: " + checkParentheses(parentheses2));
    }
}
