package Stack;

import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                case '(', '{', '[' -> stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
